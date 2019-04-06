package com.niliv.na;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.baidu.com/s?tn=02049043_8_pg&ch=3&isource=infinity&iname=baidu&itype=web&ie=utf-8&wd=activate.navicat.com");
		System.out.println(url.getProtocol()); //https
		System.out.println(url.getHost()); //www.baidu.com
		System.out.println(url.getPort()); //-1
		System.out.println(url.getFile()); ///s?tn=02049043_8_pg&ch=3&isource=infinity&iname=baidu&itype=web&ie=utf-8&wd=activate.navicat.com
		System.out.println(url.getPath()); // /s
		System.out.println(url.getDefaultPort()); //443
		
		URL url1 = new URL("https://www.baidu.com");
		InputStream is = url1.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf-8"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("index.html"));
		String lineString=null;
		while((lineString=br.readLine())!=null) {
			bw.write(lineString);
			bw.newLine();
		}
		bw.close();
		br.close();
		
	}
}
