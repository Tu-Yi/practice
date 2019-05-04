package com.niliv.servlet;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class XmlTest {
	public static void main(String[] args) throws Exception {

		SAXParserFactory spf=SAXParserFactory.newInstance();

		SAXParser parser=spf.newSAXParser();

		WebDeaultHandler handler=new WebDeaultHandler();

		parser.parse("web.xml", handler);
		
		WebContext context = new WebContext(handler.getEntitys(), handler.getMappings());
		String className = context.getClazz("/reg");
		Class clazz = Class.forName(className);
		Servletable  servletable = (Servletable)clazz.getConstructor().newInstance();
		System.out.println(servletable);
		servletable.service();
		
	}
}
