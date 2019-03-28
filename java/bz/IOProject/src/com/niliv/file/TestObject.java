package com.niliv.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObject {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//write();
		read();
	}
	public static void read() throws IOException, ClassNotFoundException {
		ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("d:\\object.txt"));
		System.out.println(oiStream.readInt());
		System.out.println(oiStream.readBoolean());
		Person p=(Person)oiStream.readObject();
		System.err.println(p);
	}
	public static void write() throws IOException {
		
		ObjectOutputStream osStream = new ObjectOutputStream(new FileOutputStream("d:\\object.txt"));
		osStream.writeInt(97);
		osStream.writeBoolean(true);
		osStream.writeObject(new Person("旺财",12));
	}
}
