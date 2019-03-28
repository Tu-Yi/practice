package com.niliv.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestPrint {
	public static void main(String[] args) throws IOException {
		
		PrintStream pStream = System.out;
		pStream.println(123);
		
		
		FileReader fReader = new FileReader("d:\\test.txt");
		BufferedReader bReader = new BufferedReader(fReader);
		PrintWriter pWriter = new PrintWriter("d:\\test2.txt");
		String line = null;
		while((line=bReader.readLine())!=null) {
			pWriter.print(line);
		}
		pWriter.close();
		bReader.close();
	}
}
