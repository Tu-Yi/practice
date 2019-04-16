package com.niliv.chatroom;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
/**
 * 客户端发送线程
 * @author yuankun
 * @Date 2019-04-16 10:40:36
 * @Description 
 *
 */
public class Send implements Runnable{

	private BufferedReader br;
	private DataOutputStream dos;
	private boolean isRunning=true;
	
	public Send(Socket socket,String name) {
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			dos = new DataOutputStream(socket.getOutputStream());
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
			isRunning=false;
			CloseAll.CloseUtil(dos,br);
		}
		return msgString;
	}
	
	public void send(String msg) {
		
		try {
			if(msg!=null && !msg.equals("")) {
				dos.writeUTF(msg);
				dos.flush();
				System.out.println("-------------------------------");
			}
		} catch (Exception e) {
			isRunning=false;
			CloseAll.CloseUtil(dos,br);
		}
		
		
	}
	
	@Override
	public void run() {
		while(isRunning) {
			send(getInput());
		}
	}

}
