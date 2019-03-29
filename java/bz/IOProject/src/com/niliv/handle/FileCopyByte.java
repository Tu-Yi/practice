package com.niliv.handle;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 利用字节流和缓冲流复制文件夹或文件
 * @author yuankun
 * @version 0.1
 */
public class FileCopyByte {
	public static void main(String[] args) throws IOException {
		File srcDir = new File("E:\\Dropbox\\工作\\锐谛");
		File posDir = new File("D:\\锐谛");
		//copyFile(srcFile, posFile);
		copyDir(srcDir, posDir);
	}
	/**
	 * 复制文件夹
	 * @param srcDir 源文件夹
	 * @param posDir 目标文件夹
	 * @throws IOException IO异常
	 */
	public static void copyDir(File srcDir, File posDir) throws IOException{
		if(!posDir.exists()) {
			posDir.mkdir();
		}
		File[] files = srcDir.listFiles();
		for (File file : files) {
			if(file.isFile()) {
				copyFile(new File(srcDir+"\\"+file.getName()), new File(posDir+"\\"+file.getName()));
			}else {
				copyDir(new File(srcDir+"\\"+file.getName()), new File(posDir+"\\"+file.getName()));
			}
		}
	}
	/**
	 * 复制文件
	 * @param srcFile 源文件
	 * @param posFile 目标文件
	 * @throws IOException IO异常
	 */
	public static void copyFile(File srcFile, File posFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(posFile));
		byte[] bytes = new byte[1024];
		int len=0;
		while((len=bis.read(bytes))!=-1) {
			bos.write(bytes);
		}
		bos.close();
		bis.close();
	}
}
