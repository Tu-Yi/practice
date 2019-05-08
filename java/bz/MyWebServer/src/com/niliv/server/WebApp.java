package com.niliv.server;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
/**
 * webapp
 * @author yuankun
 * @Date 2019-05-08 13:19:26
 * @Description 
 *
 */
public class WebApp {
	//wen上下文
	private static WebContext  webContext ;
	/**
	 * 获取解析的路由xml
	 */
	static {
		try {
			//SAX解析
			//1、获取解析工厂
			SAXParserFactory factory=SAXParserFactory.newInstance();
			//2、从解析工厂获取解析器
			SAXParser parse =factory.newSAXParser();
			//3、编写处理器
			//4、加载文档 Document 注册处理器
			WebHandler handler=new WebHandler();
			//5、解析
			parse.parse(Thread.currentThread().getContextClassLoader()
			.getResourceAsStream("WEB_CONFIG/web.xml")
			,handler);			
			//获取数据
			webContext = new WebContext(handler.getEntitys(),handler.getMappings());
		}catch(Exception e) {
			System.out.println("解析配置文件错误");
		}
	}
	/**
	 * 通过url获取配置文件对应的servlet
	 * @param url
	 * @return
	 */
	public static Servletable getServletFromUrl(String url) {		
		//假设你输入了 /login
		String className = webContext.getClz("/"+url);
		Class clz;
		try {
			System.out.println(url+"-->"+className+"-->");
			clz = Class.forName(className);
			Servletable servlet =(Servletable)clz.getConstructor().newInstance();
			return servlet;
		} catch (Exception e) {
			
		}
		
		return null;
		
	}
}
