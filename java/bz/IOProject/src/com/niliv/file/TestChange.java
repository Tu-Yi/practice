package com.niliv.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class TestChange {
	public static void main(String[] args) throws IOException {
		
		InputStream inputStream = System.in;
		InputStreamReader iReader = new InputStreamReader(inputStream,"utf-8");
		BufferedReader bReader = new BufferedReader(iReader);
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:\\a.txt"),"utf-8"));
		
		String line = null;
		while(!"over".equals(line=bReader.readLine())) {
			bWriter.write(line);
			bWriter.newLine();
			bWriter.flush();
		}
		bWriter.close();
		bReader.close();
	}
}
