package com.niliv.chatroom;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import com.niliv.tcp.client;

public class Client  {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		System.out.println("请输入名称");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		
		
		
		Socket s = new Socket("localhost",9999);
		
		new Thread(new Send(s, name)).start();
		new Thread(new Recive(s)).start();
	}
	
}
