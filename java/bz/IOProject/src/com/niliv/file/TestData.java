package com.niliv.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestData {
	
	public static void main(String[] args) throws IOException {
		
		//write();
		read();
		
	}
	public static void read() throws IOException {
		FileInputStream fStream = new FileInputStream("d:\\data.txt");
		BufferedInputStream bStream = new BufferedInputStream(fStream);
		DataInputStream dStream = new DataInputStream(bStream);
		
		System.out.println(dStream.readUTF());
		System.out.println(dStream.readInt());
		System.out.println(dStream.readDouble());
		System.out.println(dStream.readBoolean());
		
		dStream.close();
		
	}
	public static void write() throws IOException {
		
		FileOutputStream fStream = new FileOutputStream("d:\\data.txt");
		BufferedOutputStream bStream = new BufferedOutputStream(fStream);
		DataOutputStream dStream = new DataOutputStream(bStream);
		
		dStream.writeUTF("abc");
		dStream.writeInt(97);
		dStream.writeDouble(96.5);
		dStream.writeBoolean(true);
		
		dStream.close();
	}
}
