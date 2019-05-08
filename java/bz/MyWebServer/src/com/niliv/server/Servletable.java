package com.niliv.server;
/**
 * Servlet接口
 * @author yuankun
 * @Date 2019-05-08 13:18:02
 * @Description 
 *
 */
public interface Servletable {
	/**
	 * 处理方法
	 * @param req
	 * @param res
	 */
	void service(Request req,Response res);
}
