package com.niliv.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import com.niliv.utils.IOClose;
/**
 * 处理相应请求线程类
 * @author yuankun
 * @Date 2019-05-08 13:07:52
 * @Description 
 *
 */
public class Dispatcher implements Runnable {

	/**
	 * socket
	 */
	private Socket client;
	/**
	 * 请求
	 */
	Request request;
	/**
	 * 响应
	 */
	Response response;
	/**
	 * 状态码
	 */
	private int code=200;
	/**
	 * 构造函数
	 * @param client
	 */
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
	/**
	 * 处理请求
	 */
	@Override
	public void run() {
		
		try {
			//处理静态页面
			String staticString = "";
			if(null == request.getUrl() || request.getUrl().equals("")) {
				staticString = StaticDeal.handler("index");
			}else {
				staticString = StaticDeal.handler(request.getUrl());
			}
			if(!"".equals(staticString)) {
				response.print(staticString);
				response.push(200);
				IOClose.closeAll(client);
				return;
			}
			//处理数据接口
			Servletable servlet= WebApp.getServletFromUrl(request.getUrl());
			if(null!=servlet) {
				servlet.service(request, response);
				response.push(code);
				IOClose.closeAll(client);
			}else {
				code=404;
				response.print(StaticDeal.handler("404"));
				response.push(code);
				IOClose.closeAll(client);
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
	/**
	 * 释放socket
	 */
	private void releaseClient() {
		IOClose.closeAll(client);
	}

}
