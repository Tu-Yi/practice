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
		System.out.println("----------------------��������������---------------------");
		//(1)����ServerSocket����
		ServerSocket server=new ServerSocket(8888);
		
		while(true){
			Socket socket=server.accept();
			//�����߳���Ķ��󣬲������߳�
			ServerThread st=new ServerThread(socket);
			//�����߳�
			new Thread(st).start();
		}
	}
}
