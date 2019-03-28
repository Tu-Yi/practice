package com.niliv.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class TestCache {
	public static void main(String[] args) throws IOException {
		
		BufferedInputStream bReader = new BufferedInputStream(new FileInputStream("d:\\jdkhelp.CHM"));
		BufferedOutputStream bWriter = new BufferedOutputStream(new FileOutputStream("d:\\jdkhelp2.CHM"));
		
		long start = System.currentTimeMillis();
		byte[] bytes = new byte[1024];
		int len=0;
		while((len=bReader.read(bytes))!=-1) {
			bWriter.write(bytes,0,len);
			bWriter.flush();
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		bWriter.close();
		bReader.close();
		
	}
}
