import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestIO {
	public static void main(String[] args) throws IOException {
		CharHandle();
	}
	
	public static void byteHandle() throws IOException {
		//创建源
		File ifile = new File("d:/1.psd");
		File oFile = new File("d:/2.psd");
		//选择流
		InputStream is = new FileInputStream(ifile);
		OutputStream os = new FileOutputStream(oFile);
		//操作
		int temp=0;
		int len=0; //每次实际接收长度
		byte[] buf = new byte[1024]; //缓冲容器 每次循环可以接收长度
		
//				while((temp=is.read())!=-1) {
//					System.out.print((char)temp);
//				}
		
		while((len=is.read(buf))!=-1) {
			//System.out.println(new String(buf,0,len));
			//写出
			os.write(buf,0,len);
			os.flush();
		}
		//释放
		if(null!=is) {
			is.close();
		}
		if(null!=os) {
			os.close();
		}
	}
	
	public static void CharHandle() throws IOException {
		
		File ifile = new File("d:/a.txt");
		File oFile = new File("d:/c.txt");
		
		Reader reader = new FileReader(ifile);
		Writer writer = new FileWriter(oFile);
		
		char[] chars = new char[1024];
		int len = -1;
		
		while((len=reader.read(chars))!=-1) {
			System.out.println(new String(chars,0,len));
			writer.write(chars,0,len);
			writer.flush();
		}

		
		if(null!=writer) {
			reader.close();
		}
		if(null!=writer) {
			writer.close();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
