package com.niliv.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import com.niliv.utils.IOClose;


public class Server {
	
	private ServerSocket serverSocket;
	private boolean isRunning;
	public static void main(String[] args) throws IOException {
		Server server = new Server();
		server.start();
	}
	
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
	
	public void stop() {
		isRunning=false;
		IOClose.closeAll(serverSocket);
	}
}

