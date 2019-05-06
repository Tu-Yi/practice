package com.niliv.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import com.niliv.utils.IOClose;

public class Dispatcher implements Runnable {

	private Socket client;
	Request request;
	Response response;
	private int code=200;
	public Dispatcher(Socket client) {
		super();
		this.client = client;
		try {
			request = new Request(client);
			response = new Response(client);
		} catch (IOException e) {
			code=500;
			e.printStackTrace();
			releaseClient();
		}
		
	}

	@Override
	public void run() {
		
		try {
			
			if(null == request.getUrl() || request.getUrl().equals("")) {
				InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("WEB_INFO/index.html");
				response.print(new String(is.readAllBytes()));
				response.push(200);
				IOClose.closeAll(is,client);
				return;
			}
			
			Servletable servlet= WebApp.getServletFromUrl(request.getUrl());
			if(null!=servlet) {
				servlet.service(request, response);
				response.push(code);
				IOClose.closeAll(client);
			}else {
				code=400;
				InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("WEB_INFO/error.html");
				response.print(new String(is.readAllBytes()));
				response.push(404);
				IOClose.closeAll(is,client);
				return;
			}		
		} catch (Exception e) {
			code=500;
			e.printStackTrace();
			try {
				response.println("服务器错误");
				response.push(code);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	private void releaseClient() {
		IOClose.closeAll(client);
	}

}
