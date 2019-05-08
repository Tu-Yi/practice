package com.niliv.server;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.niliv.utils.IOClose;

/**
 * 静态页面处理
 * @author yuankun
 * @Date 2019-05-08 13:18:33
 * @Description 
 *
 */
public class StaticDeal {
	/**
	 * 处理静态页面
	 * properties文件中配置了静态文件名
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static String handler(String url) throws IOException {
		String reString="";
		InputStream is=null;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("src/WEB_CONFIG/static.properties");
		prop.load(fis);
		
		if(prop.getProperty(url)!=null) {
			is = Thread.currentThread().getContextClassLoader().getResourceAsStream("WEB_INFO/"+prop.getProperty(url));
			reString = new String(is.readAllBytes());
		}
		IOClose.closeAll(fis,is);
		return reString;
	}

}
