package com.niliv.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("服务器启动");
		
		ServerSocket ss = new ServerSocket(8888);
		Socket socket;
		socket = ss.accept();
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		User user=(User) ois.readObject();
		
		System.out.println(socket.getInetAddress().getHostAddress()+"请求登录:用户名"+user.getName()+"\t密码:"+user.getPassword());
		String str="";
		//(3)对用户名和密码进行验证
		if("bjsxt".equals(user.getName())&&"bjsxt".equals(user.getPassword())){
			str="登录成功";
		}else{
			str="对不起，账号号密码不正确";
		}
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(str);
		
		if(dos!=null){
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ois!=null){
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(socket!=null){
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
