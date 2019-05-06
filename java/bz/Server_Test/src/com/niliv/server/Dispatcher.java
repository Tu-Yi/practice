package com.niliv.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Dispatcher implements Runnable {

	private Socket client;
	Request request;
	Response response;
	
	public Dispatcher(Socket client) {
		super();
		this.client = client;
		try {
			request = new Request(client);
			response = new Response(client);
		} catch (IOException e) {
			
			e.printStackTrace();
			releaseClient();
		}
		
	}

	@Override
	public void run() {
		
		try {
			
			if(null == request.getUrl() || request.getUrl().equals("")) {
				InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("index.html");
				response.print(new String(is.readAllBytes()));
				response.push(200);
				is.close();
				releaseClient();
				return;
			}
			
			Servletable servlet= WebApp.getServletFromUrl(request.getUrl());
			if(null!=servlet) {
				servlet.service(request, response);
				//关注了状态码
				response.push(200);
				releaseClient();
			}else {
				//错误....
				InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("error.html");
				response.print(new String(is.readAllBytes()));
				response.push(404);
				is.close();
				releaseClient();
				return;
			}		
		} catch (Exception e) {
			e.printStackTrace();
			try {
				response.println("服务器错误");
				response.push(500);
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		}
		
	}
	
	private void releaseClient() {
		try {
			client.close();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
	}

}
