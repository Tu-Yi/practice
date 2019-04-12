package com.niliv.upImage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UpImageClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket s = new Socket("192.168.0.102",10006);
		
		FileInputStream fis = new FileInputStream("d:\\1.psd");

		OutputStream out = s.getOutputStream();
		
		
		byte[] buf = new byte[1024];
		int len=0;
		while((len=fis.read(buf))!=-1){
			
			out.write(buf,0,len);
		}
		s.shutdownOutput();
		
		InputStream in = s.getInputStream();
		byte[] bufin =new byte[1024];
		int lenin = in.read(bufin);
		String textString = new String(bufin,0,lenin);
		System.out.println(textString);
		
		fis.close();
		s.close();
	}
}
