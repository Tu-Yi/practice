package com.niliv.tran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TransClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建客户端socket
		Socket socket = new Socket("192.168.0.102", 10004);
		//创建输出输入流
		BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true); //自动刷新 ，免得后面写flush
		BufferedReader bufin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		
		String line = null;
		//发送，接收
		while((line=isr.readLine())!=null) {
			if("exit".equals(line)) {
				break;
			}
			out.println(line); //必须ln有换行标记,否则服务算readline会阻塞
			
			String upperString = bufin.readLine();
			System.out.println("服务端发来: "+upperString);
		}
		
		socket.close();
		
	}
}
