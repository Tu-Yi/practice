package com.niliv.controll;

import com.niliv.server.Request;
import com.niliv.server.Response;
import com.niliv.server.Servletable;

public class OthersServlet implements Servletable {

	@Override
	public void service(Request request,Response response) {
		response.print("其他测试页面"); 
	}

}
