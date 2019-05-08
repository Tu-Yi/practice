package com.niliv.controll;

import com.niliv.server.Request;
import com.niliv.server.Response;
import com.niliv.server.Servletable;
/**
 * 登录处理
 * @author yuankun
 * @Date 2019-05-08 13:06:12
 * @Description 
 *
 */
public class LoginServlet implements Servletable {

	@Override
	public void service(Request req,Response res) {
		
		if(req.getParameter("user")==null) {
			res.print("用户名不能为空!");
		}else if(req.getParameter("pass")==null) {
			res.print("密码不能为空!");
		}else {
			if("admin".equals(req.getParameter("user")) && "123456".equals(req.getParameter("pass"))) {
				res.print("登录成功!");
			}else {
				res.print("用户名或密码不正确!");
			}
		}
	}

}
