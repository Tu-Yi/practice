package com.niliv.upImage;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class ImageDeal implements Runnable {

	private Socket s;
	
	public ImageDeal(Socket s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(s.getInetAddress().getHostAddress()+".....connected");
			
			InputStream is = s.getInputStream();
			int name = (int)(1+Math.random()*(100000-1+1));
			FileOutputStream fos = new FileOutputStream("d:\\"+name+".psd");
			
			int len = 0;
			byte[] buf = new byte[1024];
			while((len=is.read(buf))!=-1) {
				fos.write(buf,0,len);
			}
			OutputStream out = s.getOutputStream();
			out.write("上传成功".getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
