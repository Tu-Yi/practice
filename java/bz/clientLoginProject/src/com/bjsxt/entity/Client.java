package com.bjsxt.entity;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		//(1)创建Socket对象，用于连接服务器
		Socket client=new Socket("localhost", 8888);
		//(2)获取输出流  (对象流)
		ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
		//(3)创建User对象
		          //调用获取用户对象的方法
		User u=getUser();//new User("bjsxt", "bjsxt");
		//(4)User对象发送到服务器
		oos.writeObject(u);
		
		//(5)获取输入流（数据流）
		DataInputStream dis=new DataInputStream(client.getInputStream());
		System.out.println(dis.readUTF());
		//(6)关闭流
		if(dis!=null){
			dis.close();
		}
		if(oos!=null){
			oos.close();
		}
		if(client!=null){
			client.close();
		}
	}
	//获取用户对象的方法
	public static User getUser(){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入用户名:");
		String userName=input.next();
		System.out.println("请输入密码:");
		String password=input.next();
		//封装成User对象
		return new User(userName,password);
	}
}
