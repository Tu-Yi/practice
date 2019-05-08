package com.niliv.controll;

import com.niliv.server.Request;
import com.niliv.server.Response;
import com.niliv.server.Servletable;
/**
 * 其他处理
 * @author yuankun
 * @Date 2019-05-08 13:06:37
 * @Description 
 *
 */
public class OthersServlet implements Servletable {

	@Override
	public void service(Request request,Response response) {
		response.print("其他测试页面"); 
	}

}
