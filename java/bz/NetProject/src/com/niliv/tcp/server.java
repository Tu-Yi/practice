package com.niliv.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) throws IOException {
		/**
		 * 创建服务端socket，ServerSocket对象
		 * 服务端必须对外提供端口，否则客户端无法连接
		 * 获取连接过来的客户端对象
		 * 通过客户端对象获取socket流，读取客户端发来的数据
		 * 关闭资源 关客户端 关服务端
		 */
		
		ServerSocket ss = new ServerSocket(10001);
		Socket s = ss.accept(); //阻塞
		String ip = s.getInetAddress().getHostAddress();
		InputStream is =  s.getInputStream();
		byte[] buf = new byte[1024];
		int len = is.read(buf);
		String text = new String(buf,0,len);
		System.out.println(ip + " server:"+text);
		
		OutputStream os = s.getOutputStream();
		os.write("收到".getBytes());
		
		s.close();
		ss.close();
		
	}
}
