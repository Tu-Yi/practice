package com.niliv.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Recive implements Runnable {

	private DatagramSocket ds;
	
	public Recive(DatagramSocket ds) {
		this.ds = ds;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				byte[] buf = new byte[1024];
				DatagramPacket dPacket = new DatagramPacket(buf, buf.length);
				
				ds.receive(dPacket);
				
				String ipString = dPacket.getAddress().getHostAddress();
				int port = dPacket.getPort();
				String text=new String(dPacket.getData(),0,dPacket.getLength());
				System.out.println(ipString + port + text);
				if(text.equals("exit")) {
					System.out.println("退出聊天室");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ds.close();
		}
	}

}
