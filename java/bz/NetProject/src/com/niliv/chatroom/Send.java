package com.niliv.chatroom;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Send implements Runnable{

	private BufferedReader br;
	private DataOutputStream dos;
	private boolean isRunning=true;
	private String name;
	
	public Send(Socket socket,String name) {
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			dos = new DataOutputStream(socket.getOutputStream());
			this.name = name;
			send(name);
		} catch (Exception e) {
			isRunning=false;
			CloseAll.CloseUtil(dos,br);
		}
		
	}
	
	public String getInput() {
		String msgString="";
		
		try {
			msgString = br.readLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return msgString;
	}
	
	public void send(String msg) {
		
		try {
			if(msg!=null && !msg.equals("")) {
				dos.writeUTF(msg);
				dos.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	@Override
	public void run() {
		while(isRunning) {
			send(getInput());
		}
	}

}
