package com.niliv.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLBoundFault;

public class client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		/**
		 * 创建tcp客户端socket，使用socket对象初始化连接通道
		 * 如果连接建立成功，说明数据传输通道已建立，该通道就是socket流，是底层建立好的
		 * 可以通过getOutputStream,getInputStream获取字节流
		 * 使用输出流将数据写出
		 * 关闭资源
		 */
		//创建客户端socket
		Socket socket = new Socket("192.168.0.102", 10001);
		//获取socket输出流
		OutputStream out = socket.getOutputStream();
		out.write("tcp来了".getBytes());
		
		InputStream is = socket.getInputStream();
		byte[] buf = new byte[1024]; 
		int len = is.read(buf);
		String text = new String(buf,0,len);
		System.out.println(text);
		
		
		socket.close();
	}
}
