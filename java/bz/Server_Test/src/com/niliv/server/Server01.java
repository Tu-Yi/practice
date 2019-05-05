package com.niliv.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class Server01 {
	
	private ServerSocket serverSocket;
	
	public static void main(String[] args) throws IOException {
		Server01 server = new Server01();
		server.start();
	}
	
	public void start() throws IOException {
		serverSocket = new ServerSocket(8888);
		receive();
	}
	
	public void receive() throws IOException {
		Socket client= serverSocket.accept();
		System.out.println("一个客户端建立连接");
		
		Request request = new Request(client);
		
		Response response = new Response(client);
		
		Servletable servlet= WebApp.getServletFromUrl(request.getUrl());
		if(null!=servlet) {
			servlet.service(request, response);
			//关注了状态码
			response.push(200);
		}else {
			//错误....
			response.push(404);
		}		
		
		
		response.push(200); 
		
	}
	
	public void stop() {
		
	}

	
}

