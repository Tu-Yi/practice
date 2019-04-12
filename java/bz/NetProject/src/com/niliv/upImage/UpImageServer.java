package com.niliv.upImage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UpImageServer {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(10006);
		while(true) {
			Socket s = ss.accept();
			new Thread(new ImageDeal(s)).start();
		}
		
	}
}
