package com.niliv.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;
/**
 * 处理响应
 * @author yuankun
 * @Date 2019-05-08 13:13:39
 * @Description 
 *
 */
public class Response {
	//输出流
	private BufferedWriter bw;
	//响应内容
	private StringBuilder content;
	//响应头
	private StringBuilder header;
	//响应长度
	private int len;
	//空格
	private final String blank=" ";
	//空行
	private final String crlf = "\r\n";
	/**
	 * 构造函数
	 */
	public Response() {
		content = new StringBuilder();
		header = new StringBuilder();
		len=0;
	}
	/**
	 * 构造函数
	 * @param client
	 * @throws IOException
	 */
	public Response(Socket client) throws IOException {
		this();
		bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
	}
	/**
	 * 构造函数
	 * @param os
	 */
	public Response(OutputStream os) {
		this();
		bw = new BufferedWriter(new OutputStreamWriter(os));
	}
	/**
	 * 拼接响应内容
	 * @param info
	 * @return
	 */
	public Response print(String info) {
		content.append(info);
		len+=info.getBytes().length;
		return this;
	}
	/**
	 * 拼接响应内容带换行
	 * @param info
	 * @return
	 */
	public Response println(String info) {
		content.append(info).append(crlf);
		len+=(info+crlf).getBytes().length;
		return this;
	}
	/**
	 * 拼接响应头
	 * @param code
	 */
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
	/**
	 * 响应
	 * @param code
	 * @throws IOException
	 */
	public void push(int code) throws IOException {
		createrHeader(code);
		bw.append(header);
		bw.append(content);
		bw.flush();
	}
}
