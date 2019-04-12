package com.niliv.webserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyBrower {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("192.168.0.102",9998);
		
		PrintWriter req = new PrintWriter(socket.getOutputStream(),true);
		
		req.println("GET /?id=1 HTTP/1.1");
		req.println("Host: 192.168.0.102:9998");
		req.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:66.0) Gecko/20100101 Firefox/66.0");
		req.println("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		req.println("Accept-Language: zh-CN,en-US;q=0.7,en;q=0.3");
		req.println("Accept-Encoding: gzip, deflate");
		req.println("Connection: keep-alive");
		
		InputStream res = socket.getInputStream();
		byte[] buf = new byte[1024];
		int len = res.read(buf);
		String string = new String(buf,0,len);
		System.out.println(string);
		
		socket.close();
	}
}
