package com.niliv.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import com.niliv.handle.FileCopyByte;

public class TestUtils {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
//		long start = System.currentTimeMillis();
//		IOUtils io = new IOUtils();
//		io.copy(new FileInputStream("d:\\jdkhelp.CHM"), new FileOutputStream("d:\\jdk.CHM"));
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
//		byte[] bytes = new byte[42000000];
//		io.read(new FileInputStream("d:\\jdkhelp.CHM"),bytes);
//		io.write(bytes, new FileOutputStream("d:\\jdk.CHM"));
//		
//		long start1 = System.currentTimeMillis();
//		FileCopyByte.copyFile(new File("d:\\jdkhelp.CHM"), new File("d:\\jdk.CHM"));
//		long end1 = System.currentTimeMillis();
//		System.out.println(end1-start1);
//		
//		//速度最快
//		long start2 = System.currentTimeMillis();
//		FileUtils fUtils = new FileUtils();
//		fUtils.copyFile(new File("d:\\jdkhelp.CHM"), new File("d:\\jdk.CHM"));
//		long end2 = System.currentTimeMillis();
//		System.out.println(end2-start2);
		
		File srcDir = new File("E:\\Dropbox\\工作\\锐谛");
		File posDir = new File("D:\\锐谛");
		
//		long start = System.currentTimeMillis();
//		FileCopyByte.copyDir(srcDir, posDir);
//		long end = 	System.currentTimeMillis();
//		System.out.println(end-start);
		
		long start = System.currentTimeMillis();
		FileUtils.copyDirectory(srcDir, posDir);
		long end = 	System.currentTimeMillis();
		System.out.println(end-start);
	}
	
}
