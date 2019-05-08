package com.niliv.controll;


import com.niliv.server.Request;
import com.niliv.server.Response;
import com.niliv.server.Servletable;
/**
 * 文件上传处理 尚未完成
 * @author yuankun
 * @Date 2019-05-08 13:07:09
 * @Description 
 *
 */
public class UploadServlet implements Servletable {

	@Override
	public void service(Request req, Response res) {
		System.out.println("uploadservlet");
		System.out.println(req);
		res.print("上传成功");
	}

}
