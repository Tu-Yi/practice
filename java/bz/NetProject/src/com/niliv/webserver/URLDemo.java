package com.niliv.webserver;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {
	public static void main(String[] args) throws IOException {
		String surl = "http://192.168.0.102:9999/index.html";
		URL url = new URL(surl);
		
		//InputStream req = url.openStream();
		
		URLConnection conn = url.openConnection();
		System.out.println(conn.getHeaderField("Date"));
		
		InputStream req = conn.getInputStream();
		byte[] buf = new byte[1024];
		int len=req.read(buf);
		String res = new String(buf,0,len);
		System.out.println(res);
		req.close();
	}
}
