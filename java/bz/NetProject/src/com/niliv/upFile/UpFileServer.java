package com.niliv.upFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import com.niliv.tcp.server;


public class UpFileServer {
	public static void main(String[] args) throws IOException {
		
		System.out.println("上传服务端。。。。。。。。。");
		
		ServerSocket ss = new ServerSocket(10005);
		
		Socket s = ss.accept();
		
		System.out.println(s.getInetAddress().getHostAddress()+".....connected");
		
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		BufferedWriter bufw = new BufferedWriter(new FileWriter("d:\\server.txt"));
		
		String line = null;
		
		while((line=bufIn.readLine())!=null){
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println("上传成功");
		
		bufw.close();
		
		s.close();
		ss.close();
	}
}
