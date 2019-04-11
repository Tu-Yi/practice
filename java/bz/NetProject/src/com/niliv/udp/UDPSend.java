package com.niliv.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSend {
	public static void main(String[] args) throws IOException {
		/**
		 * 创建UDP发送端
		 * 1，建立udp的socket服务
		 * 2，将要发送的数据封装到数据包
		 * 3，通过udp的socket服务发送数据包
		 * 4，关闭socket服务
		 */
		System.out.println("发送端");
		
		DatagramSocket dSocket = new DatagramSocket();
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		String lineString = null;
		while((lineString=bufr.readLine())!=null) {
			byte[] buf = lineString.getBytes();
			DatagramPacket dPacket = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.0.102"),10000);
			
			dSocket.send(dPacket);
			if("exit".equals(lineString)) {
				break;
			}
		}

		
		dSocket.close();
	}
}
