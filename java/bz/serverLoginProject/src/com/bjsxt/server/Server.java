package com.bjsxt.server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.bjsxt.entity.User;
import com.bjsxt.thread.ServerThread;

public class Server {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("----------------------服务器端已启动---------------------");
		//(1)创建ServerSocket对象
		ServerSocket server=new ServerSocket(8888);
		
		while(true){
			Socket socket=server.accept();
			//创建线程类的对象，并启动线程
			ServerThread st=new ServerThread(socket);
			//启动线程
			new Thread(st).start();
		}
	}
}
