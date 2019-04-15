package com.niliv.chatroom;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class Server {
	private List<MyChannel> all = new ArrayList();
	
	public static void main(String[] args) throws IOException {
		new Server().start();
		
	}
	public void start() throws IOException {
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("服务端已启动");
		while(true) {
			Socket s = ss.accept();
			MyChannel channel = new MyChannel(s);
			all.add(channel);
			new Thread(channel).start();
		}
	}
	
	
	private class MyChannel implements Runnable{
		DataInputStream dis;
		DataOutputStream dos;
		private boolean isRunning=true;
		private String name;
		
		public MyChannel(Socket socket) {
			try {
				dis = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
				this.name=dis.readUTF();
				System.out.println(name);
				this.send("欢迎进入聊天室");
				this.sendOther("进入了聊天室");
			} catch (Exception e) {
				CloseAll.CloseUtil(dis,dos);
				isRunning=false;
			}
			
		}
		
		private String receive() {
			String msg = "";
			try {
				msg = dis.readUTF();
				System.out.println(msg);
			} catch (Exception e) {
				CloseAll.CloseUtil(dis,dos);
				isRunning=false;
				all.remove(this);
				
			}
			return msg;
		}
		
		private void send(String msg) {
			if(null==msg || msg.equals("")) {
				return;
			}
			try {
				System.out.println("发给自己"+msg);
				dos.writeUTF(msg);
				dos.flush();
			} catch (Exception e) {
				CloseAll.CloseUtil(dis,dos);
				isRunning=false;
				all.remove(this);
			}
			
		}
		
		private void sendOther(String msg) {
			
			if(msg.startsWith("@")) {
				
				String nameString = msg.substring(1,msg.indexOf(" "));
				String content = msg.substring(msg.indexOf(" ")+1);
				for (MyChannel myChannel : all) {
					if(myChannel.name.equals(nameString)) {
						myChannel.send(this.name+"对您悄悄的说"+content);
					}
				}
				
			}else {
				for (MyChannel myChannel : all) {
					if(myChannel==this) {
						continue;
					}else {
						myChannel.send(this.name+ ": "+msg);
					}
				}
			}
		}
		
		@Override
		public void run() {
			while(isRunning) {
				sendOther(receive());
			}
		}
	}
}


