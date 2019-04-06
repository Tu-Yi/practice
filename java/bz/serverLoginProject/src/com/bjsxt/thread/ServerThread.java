package com.bjsxt.thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import com.bjsxt.entity.User;

public class ServerThread implements Runnable{
	private Socket socket;//成员变量
	public ServerThread(Socket socket){
		this.socket=socket;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"请求登录");
		//(2)获取输入流--（对象流）
		ObjectInputStream ois=null;
		//(4)获取输出流(数据流)
		DataOutputStream dos=null;
		try {
			ois = new ObjectInputStream(socket.getInputStream());
			User user=(User) ois.readObject();
			
			System.out.println(socket.getInetAddress().getHostAddress()+"请求登录:用户名"+user.getUserName()+"\t密码:"+user.getPassword());
			String str="";
			//(3)对用户名和密码进行验证
			if("bjsxt".equals(user.getUserName())&&"bjsxt".equals(user.getPassword())){
				str="登录成功";
			}else{
				str="对不起，账号号密码不正确";
			}
			dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(str);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				//(5)关闭流
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

}
