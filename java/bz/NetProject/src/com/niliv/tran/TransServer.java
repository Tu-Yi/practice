package com.niliv.tran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TransServer {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(10004);
		Socket socket = ss.accept();
		String ip = socket.getInetAddress().getHostAddress();
		System.out.println(ip + "connect....");
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter pw = new PrintWriter(socket.getOutputStream(),true); //自动刷新 ，免得后面写flush
		
		String line = null;
		while((line=br.readLine())!=null) {
			System.out.println(ip+"客户端发来: "+line);
			String upperString = line.toUpperCase();
			pw.println(upperString); //必须ln有换行标记,否则客户端readline会阻塞
		}
		
		socket.close();
		ss.close();
		
		
	}
}
