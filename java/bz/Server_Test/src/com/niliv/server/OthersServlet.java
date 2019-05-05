package com.niliv.server;

public class OthersServlet implements Servletable {

	@Override
	public void service(Request request,Response response) {
		response.print("其他测试页面"); 
	}

}
