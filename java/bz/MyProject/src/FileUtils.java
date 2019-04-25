import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {

	public static void main(String[] args) throws FileNotFoundException {
		
		File rFile = new File("d:/1.psd");
		File pFile = new File("d:/2.psd");
		copyFile(rFile,pFile);
	}

	public static void copyFile(File rFile, File pFile) {

		//Try-with-resources
		try(InputStream is = new FileInputStream(rFile);
				OutputStream os = new FileOutputStream(pFile);) {
			int temp = 0;
			int len = 0; // 每次实际接收长度
			byte[] buf = new byte[1024]; // 缓冲容器 每次循环可以接收长度

			while ((len = is.read(buf)) != -1) {
				os.write(buf, 0, len);
				os.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * 释放资源
	 */
	public static void closeStream(Closeable... io) {
		for (Closeable closeable : io) {
			if (null != io) {
				try {
					closeable.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void close() {

	}

}
