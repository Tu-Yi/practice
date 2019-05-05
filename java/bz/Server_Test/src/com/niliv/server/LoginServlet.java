package com.niliv.server;

public class LoginServlet implements Servletable {

	@Override
	public void service(Request req,Response res) {
		
		res.print("<html><body>登陆成功是 --- ");
		res.print(req.getParameter("uname"));
		res.print("</body></html>");
	}

}
