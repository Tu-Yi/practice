package com.niliv.na;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class TestNa {
	public static void main(String[] args) throws UnknownHostException {
	
		/*InetAddress*/
		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia.getHostName()); //localhost
		System.out.println(ia.getHostAddress()); //127.0.0.1
		
		InetAddress ia2 = InetAddress.getLocalHost();
		System.out.println(ia2.getHostName()); //SC-201901080146
		System.out.println(ia2.getHostAddress()); //192.168.0.108
		
		InetAddress ia3 = InetAddress.getByName("127.0.0.1");
		System.out.println(ia3.getHostName()); //activate.navicat.com
		System.out.println(ia3.getHostAddress()); //127.0.0.1
		
		InetAddress ia4 = InetAddress.getByName("www.baidu.com");
		System.out.println(ia4.getHostName()); //www.baidu.com
		System.out.println(ia4.getHostAddress()); //180.97.33.107
		
		/*InetSocketAddress*/
		InetSocketAddress isa = new InetSocketAddress("localhost", 80);
		System.out.println(isa.getHostName()); //localhost
		System.out.println(isa.getAddress()); //localhost/127.0.0.1
		System.out.println(isa.getPort()); //80
		
		InetSocketAddress isa1 = new InetSocketAddress(ia4, 80);
		System.out.println(isa1.getHostName()); //www.baidu.com
		System.out.println(isa1.getAddress()); //www.baidu.com/180.97.33.107
		System.out.println(isa1.getPort()); //80
	}
}
