package com.niliv.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

public class Response {
	
	private BufferedWriter bw;
	private StringBuilder content;
	private StringBuilder header;
	private int len;
	private final String blank=" ";
	private final String crlf = "\r\n";
	
	public Response() {
		content = new StringBuilder();
		header = new StringBuilder();
		len=0;
	}
	
	public Response(Socket client) throws IOException {
		this();
		bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
	}
	
	public Response(OutputStream os) {
		this();
		bw = new BufferedWriter(new OutputStreamWriter(os));
	}
	
	public Response print(String info) {
		content.append(info);
		len+=info.getBytes().length;
		return this;
	}
	public Response println(String info) {
		content.append(info).append(crlf);
		len+=(info+crlf).getBytes().length;
		return this;
	}
	
	private void createrHeader(int code) {
		
		header.append("HTTP/1.1").append(blank);
		header.append(code).append(blank);
		switch (code) {
		case 200:
			header.append("OK").append(crlf);
			break;
		case 404:
			header.append("Not Found").append(crlf);
			break;
		case 500:
			header.append("Server Error").append(crlf);
			break;
		default:
			break;
		}
		header.append("Access-Control-Allow-Origin:").append("*").append(crlf);
		header.append("Date:").append(new Date()).append(crlf);
		header.append("Server:").append("niliv Server/0.0.1;charset=UTF-8").append(crlf);
		header.append("Content-type:text/html").append(crlf);
		header.append("Content-length:").append(len).append(crlf);
		header.append(crlf);
	}
	
	public void push(int code) throws IOException {
		createrHeader(code);
		bw.append(header);
		bw.append(content);
		bw.flush();
	}
}
