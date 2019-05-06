package com.niliv.controll;

import com.niliv.server.Request;
import com.niliv.server.Response;
import com.niliv.server.Servletable;

public class RegisterServlet implements Servletable{

	@Override
	public void service(Request req,Response res) {
		if(req.getParameter("user")==null) {
			res.print("用户名不能为空!");
		}else if(req.getParameter("pass")==null) {
			res.print("密码不能为空!");
		}else {
			res.print("注册成功!");
		}
	}

}
