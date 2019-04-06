package com.bjsxt.entity;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		//(1)����Socket�����������ӷ�����
		Socket client=new Socket("localhost", 8888);
		//(2)��ȡ�����  (������)
		ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
		//(3)����User����
		          //���û�ȡ�û�����ķ���
		User u=getUser();//new User("bjsxt", "bjsxt");
		//(4)User�����͵�������
		oos.writeObject(u);
		
		//(5)��ȡ����������������
		DataInputStream dis=new DataInputStream(client.getInputStream());
		System.out.println(dis.readUTF());
		//(6)�ر���
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
	//��ȡ�û�����ķ���
	public static User getUser(){
		Scanner input=new Scanner(System.in);
		System.out.println("�������û���:");
		String userName=input.next();
		System.out.println("����������:");
		String password=input.next();
		//��װ��User����
		return new User(userName,password);
	}
}
