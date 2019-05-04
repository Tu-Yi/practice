package com.niliv.servlet;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class XmlTest {
	public static void main(String[] args) throws Exception {
	//1)	创建SAXParserFactory的对象
		SAXParserFactory spf=SAXParserFactory.newInstance();
	//2)	创建SAXParser对象 (解析器)
		SAXParser parser=spf.newSAXParser();
	//3)	创建一个DefaultHandler的子类
		WebDeaultHandler handler=new WebDeaultHandler();
	//4)	调用parse方法
		parser.parse("web.xml", handler);
		
		WebContext context = new WebContext(handler.getEntitys(), handler.getMappings());
		String className = context.getClazz("/reg");
		Class clazz = Class.forName(className);
		Servletable  servletable = (Servletable)clazz.getConstructor().newInstance();
		System.out.println(servletable);
		servletable.service();
		
	}
}
