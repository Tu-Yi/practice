package com.niliv.webserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {
	public static void main(String[] args) throws IOException {
		String surl = "http://192.168.0.102:9999/index.html";
		//URL url = new URL(surl);
		
		//InputStream req = url.openStream();
		
//		URLConnection conn = url.openConnection();
//		System.out.println(conn.getHeaderField("Date"));
//		
//		InputStream req = conn.getInputStream();
//		byte[] buf = new byte[1024];
//		int len=req.read(buf);
//		String res = new String(buf,0,len);
//		System.out.println(res);
//		req.close();
		
		URL url = new URL("http://www.baidu.com/index.html#aa?uname=bjsxt");
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getFile());
		System.out.println(url.getPath());
		System.out.println(url.getRef()); // 锚点，参数一起返回
		System.out.println(url.getQuery()); //存在锚点，返回null
		
		URL url1 = new URL("http://www.baidu.com");
		InputStream iStream = url.openConnection().getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(iStream,"utf-8"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:\\baidu.html"),"utf-8"));
		String res = null;
		while((res=br.readLine())!=null) {
			bw.append(res);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
		
		
//		byte[] buf = new byte[1024];
//		int len=0;
//		while((len=iStream.read(buf))!=-1) {
//			System.out.println(new String(buf,0,len));
//		}
//		iStream.close();
	}
}
