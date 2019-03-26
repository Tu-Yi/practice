package com.niliv.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestFileStream {
	public static void main(String[] args) throws IOException {
		
//		//写入文件
//		FileOutputStream fisOutputStream = null;
//		try {
//			//true代表append
//			fisOutputStream = new FileOutputStream("d:\\a.txt",true);
//			//fisOutputStream.write(97);
//			byte[] bytes = "百战".getBytes();
//			fisOutputStream.write(bytes);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if(fisOutputStream!=null)
//				fisOutputStream.close();
//		}
//		
//		//读取单个字节,由于byte和char位数不同，缓冲区大小不同，所以中文会乱码，只有只用bytes或者缓冲流才能解决
//		FileInputStream fisInputStream = null;
//		fisInputStream = new FileInputStream("d:\\a.txt");
//		int count = fisInputStream.available();
//		System.out.println(count);
//		int buf=0;
//		int i =0;
//		//因为fisInputStream.read()会不断读取，所以这里先赋值给buf,避免在循环里获取不到原先的值
//		while((buf=fisInputStream.read())!=-1) {
//			i++;
//			System.out.print((char)buf);
//		}
//		fisInputStream.close();
//		System.out.println(i);
//		
//		//读入到bytes
//		FileInputStream fileInputStream = new FileInputStream("d:\\a.txt");
//		byte[] bytes = new byte[1024];
//		int len = 0;
//		while((len=fileInputStream.read(bytes))!=-1) {
//			System.out.println(new String(bytes,0,len));
//		}
//		fileInputStream.close();
		
		//copyFile("d:\\a.txt", "d:\\b.txt");
		
//		//写入文件
//		FileOutputStream fisOutputStream = null;
//		try {
//			//true代表append
//			fisOutputStream = new FileOutputStream("d:\\a.txt",true);
//			//fisOutputStream.write(97);
//			byte[] bytes = "百战".getBytes();
//			fisOutputStream.write(bytes);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if(fisOutputStream!=null)
//				fisOutputStream.close();
//		}
//		
		//读取单个字符，不会乱码，因为字符可以存储汉字
		FileReader fileReader = null;
		fileReader = new FileReader("d:\\a.txt");
		int buf=0;
		int i =0;
		while((buf=fileReader.read())!=-1) {
			i++;
			System.out.print((char)buf);
		}
		fileReader.close();
		System.out.println(i);
		
		//读写chars
		FileReader fileReaderByte = new FileReader("d:\\a.txt");
		FileWriter fileWriter = new FileWriter("d:\\b.txt");
		char[] chars = new char[1024];
		int len = 0;
		while((len=fileReaderByte.read(chars))!=-1) {
			System.out.println(new String(chars,0,len));
			fileWriter.write(chars,0,len);
		}
		fileWriter.close();
		fileReaderByte.close();
	}
	public static void copyFile(String fileSrc,String fileDesc) throws IOException {
		FileInputStream srcStream = new FileInputStream(fileSrc);
		FileOutputStream descStream = new FileOutputStream(fileDesc);
		byte[] bytes = new byte[srcStream.available()];
		int len = 0;
		while((len=srcStream.read(bytes))!=-1) {
			descStream.write(bytes,0,len);
		}
		descStream.close();
		srcStream.close();
	}
}
