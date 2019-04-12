package com.niliv.webserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class MyTomcat {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9998);
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress());
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String text = new String(buf,0,len);
		System.out.println(text);
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println("HTTP/1.1 404");

		s.close();
		ss.close();
	}
}
