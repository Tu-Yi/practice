package com.niliv.file;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestArrayStream {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		byte[] bytes = write();
		read(bytes);
		
		

		
		
	}
	public static void read(byte[] bytes) throws IOException, ClassNotFoundException {
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		System.out.println(ois.readInt());
		System.out.println(ois.readDouble());
		System.out.println(ois.readObject());
		System.err.println(ois.readUTF());
		ois.close();
		bis.close();
	}
	public static byte[] write() throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeInt(91);
		oos.writeDouble(91.5);
		oos.writeObject(new Person("旺财", 12));
		oos.writeUTF("hello");
		oos.close();
		bos.close();
		
		return bos.toByteArray();
	}
	
	
}
