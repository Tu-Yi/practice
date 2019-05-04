import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * RandomAccessFile
 * @author Administrator
 * @Date 2019-04-27 10:45:50
 * @Description 
 *
 */
public class FileSplit {
	public static void main(String[] args) throws IOException {
		//getAll(2);
		getContent(2);
	}
	/**
	 * 起始位置，获取剩余所有内容
	 * @param num
	 * @throws IOException
	 */
	public static void getAll(int num) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("d:/c.txt", "r");
		raf.seek(num);
		byte[] buf = new byte[1024];
		int len=-1;
		while((len=raf.read(buf))!=-1) {
			System.out.println(new String(buf,0,len));
		}
		raf.close();
	}
	/**
	 * 起始位置，获取指定所有内容
	 * @param num
	 * @throws IOException
	 */
	public static void getContent(int num) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("d:/c.txt", "r");
		int beginPos = num;
		int actualSize = 1026;
		raf.seek(beginPos);
		byte[] buf = new byte[1024];
		int len=-1;
		while((len=raf.read(buf))!=-1) {
			System.out.println(new String(buf,0,len));
			if(actualSize>len) {
				actualSize -= len;
			}else {
				System.out.println(new String(buf,0,len));
				break;
			}
		}
		raf.close();
	}
}
