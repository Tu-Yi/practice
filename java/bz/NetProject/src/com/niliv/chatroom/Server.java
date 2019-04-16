package com.niliv.chatroom;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 服务端
 * @author yuankun
 * @Date 2019-04-16 10:38:10
 * @Description 
 *
 */
public class Server {
	private List<MyChannel> all = new ArrayList();
	
	public static void main(String[] args) throws IOException {
		new Server().start();
	}
	/**
	 * 启动线程
	 * @throws IOException
	 */
	public void start() throws IOException {
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("服务端已启动:9999");
		while(true) {
			Socket s = ss.accept();
			MyChannel channel = new MyChannel(s);
			all.add(channel);
			new Thread(channel).start();
		}
	}
	
	/**
	 * 服务端线程内部类
	 * @author yuankun
	 * @Date 2019-04-16 10:39:05
	 * @Description 
	 *
	 */
	private class MyChannel implements Runnable{
		DataInputStream dis;
		DataOutputStream dos;
		private boolean isRunning=true;
		private String name;
		private String headerString="";
		
		public MyChannel(Socket socket) {
			try {
				dis = new DataInputStream(socket.getInputStream());
				dos = new DataOutputStream(socket.getOutputStream());
				this.name=dis.readUTF();
				this.headerString = "系统：";
				this.send(this.headerString+name+"欢迎进入聊天室");
				this.sendOther(name+"进入了聊天室");
				this.headerString = this.name+"：";
			} catch (Exception e) {
				CloseAll.CloseUtil(dis,dos);
				isRunning=false;
			}
			
		}
		/**
		 * 接收
		 * @return
		 */
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
		/**
		 * 发送
		 * @param msg
		 */
		private void send(String msg) {
			if(null==msg || msg.equals("")) {
				return;
			}
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (Exception e) {
				CloseAll.CloseUtil(dis,dos);
				isRunning=false;
				all.remove(this);
			}
			
		}
		/**
		 * 发给其他客户端
		 * @param msg
		 */
		private void sendOther(String msg) {
			
			if(msg.startsWith("@")) {
				
				String nameString = msg.substring(1,msg.indexOf(" "));
				String content = msg.substring(msg.indexOf(" ")+1);
				for (MyChannel myChannel : all) {
					if(myChannel.name.equals(nameString)) {
						myChannel.send(this.headerString+"(对您悄悄的说)"+"\n"+content);
					}
				}
				
			}else {
				for (MyChannel myChannel : all) {
					if(myChannel==this) {
						continue;
					}else {
						myChannel.send(this.headerString+"\n"+msg);
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


