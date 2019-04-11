package com.niliv.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send implements Runnable {

	private DatagramSocket ds;
	
	public Send(DatagramSocket ds) {
		this.ds = ds;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			String lineString = null;
			while((lineString=bufr.readLine())!=null) {
				byte[] buf = lineString.getBytes();
				DatagramPacket dPacket = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.0.102"),10000);
				
				ds.send(dPacket);
				if("exit".equals(lineString)) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
