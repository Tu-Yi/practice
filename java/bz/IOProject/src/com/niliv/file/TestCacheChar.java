package com.niliv.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCacheChar {
	public static void main(String[] args) throws IOException {
		
		FileReader fReader = new FileReader("d:\\test.txt");
		FileWriter fWriter = new FileWriter("d:\\test2.txt");
		BufferedReader bReader = new BufferedReader(fReader);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		
		String line = null;
		char[] chars = new char[1024];
		int len=0;
		long start = System.currentTimeMillis();
		while((line=bReader.readLine())!=null) {
			bWriter.write(line);
			bWriter.newLine();
			
		}
//		while((len=fReader.read(chars))!=-1) {
//			fWriter.write(chars, 0, len);
//		}
		long end = System.currentTimeMillis();
		System.out.println(end-start); //57
		bWriter.close();
		bReader.close();
	}
}
