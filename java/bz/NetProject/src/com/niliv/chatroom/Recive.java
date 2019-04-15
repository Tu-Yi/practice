package com.niliv.chatroom;

import java.io.DataInputStream;
import java.net.Socket;

public class Recive implements Runnable {
	
	private DataInputStream dis;
	private boolean isRunning=true;
	
	public Recive(Socket socket) {
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (Exception  e) {
			// TODO: handle exception
			isRunning=false;
			CloseAll.CloseUtil(dis);
		}
	}
	public String receive() {
		String msg = "";
		try {
			msg = dis.readUTF();
		} catch (Exception e) {
			isRunning=false;
			CloseAll.CloseUtil(dis);
		}
		return msg;
	}
	@Override
	public void run() {
		while(isRunning) {
			System.out.println(receive());
		}
	}
}
