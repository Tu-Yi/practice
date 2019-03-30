package com.niliv.handle;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TestMain {
	public static void main(String[] args) throws IOException {
		File srcDir = new File("E:\\Dropbox\\工作\\锐谛");
		File posDir = new File("D:\\锐谛");
		
		double start = System.currentTimeMillis();
		//自定义拷贝方法
		//FileCopyByte.copyDir(srcDir, posDir);
		FileUtils.copyDirectory(srcDir, posDir);
		double end = System.currentTimeMillis();
		System.out.println((end-start)/1000 + "秒");
	}
}
