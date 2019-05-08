package com.niliv.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import com.niliv.utils.IOClose;

/**
 * 服务
 * @author yuankun
 * @Date 2019-05-08 13:16:35
 * @Description 
 *
 */
public class Server {
	//socket
	private ServerSocket serverSocket;
	//是否运行
	private boolean isRunning;
	public static void main(String[] args) throws IOException {
		Server server = new Server();
		server.start();
	}
	/**
	 * 开始运行
	 */
	public void start() {
		try {
			serverSocket = new ServerSocket(8888);
			isRunning=true;
			receive();
		} catch (IOException e) {
			e.printStackTrace();
			stop();
		}
		
	}
	/**
	 * 接收请求
	 */
	public void receive() {
		
		try {
			while(isRunning) {
				Socket client= serverSocket.accept();
				new Thread(new Dispatcher(client)).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
			stop();
		}
	}
	/**
	 * 停止运行
	 */
	public void stop() {
		isRunning=false;
		IOClose.closeAll(serverSocket);
	}
}

