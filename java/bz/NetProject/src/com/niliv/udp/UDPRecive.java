package com.niliv.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPRecive {
	public static void main(String[] args) throws IOException {
		/**
		 * UDP接收端
		 * 1，建立UDP的socket服务
		 * 2，创建数据包，存储接收到的数据，用数据包的方法解析数据
		 * 3，使用socket服务的receive方法将接收到的数据存储到数据包
		 * 4，数据包解析数据
		 * 5，关闭资源
		 */
		System.out.println("接收端");
		
		DatagramSocket dpSocket = new DatagramSocket(10000);
		
		byte[] buf = new byte[1024];
		DatagramPacket dPacket = new DatagramPacket(buf, buf.length);
		
		dpSocket.receive(dPacket);
		
		String ipString = dPacket.getAddress().getHostAddress();
		int port = dPacket.getPort();
		String text=new String(dPacket.getData(),0,dPacket.getLength());
		System.out.println(ipString + port + text);
		
		dpSocket.close();
		
	}
}
