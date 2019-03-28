package com.niliv.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSer {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String fileStudent = "d:\\\\student.txt";
		//write(fileStudent);
		read(fileStudent); //Student [name=小强, age=12, pwd=null, className=null]
		
	}
	
	public static void read(String filePath) throws IOException, ClassNotFoundException {
		ObjectInputStream oisStream = new ObjectInputStream(new FileInputStream(filePath));
		Student student = (Student)oisStream.readObject();
		System.out.println(student);
	}
	
	public static void write(String filePath) throws IOException {
		ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream(filePath));
		Student student = new Student("小强", 12, "888888");
		Student.setClassName("少年班");
		ooStream.writeObject(student);
		ooStream.close();
	}
}
