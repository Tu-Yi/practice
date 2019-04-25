import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestArrayStream {
	public static void main(String[] args) throws IOException {
//		//创建源
//		byte[] src = "talk is cheap show me the code".getBytes();
//		byte[] dest=null;
//		//选择流
//		InputStream is = new ByteArrayInputStream(src);
//		ByteArrayOutputStream os = new ByteArrayOutputStream();
//		//操作
//		int temp=0;
//		int len=0; //每次实际接收长度
//		byte[] buf = new byte[1024]; //缓冲容器 每次循环可以接收长度
//		
//		while((len=is.read(buf))!=-1) {
//			System.out.println(new String(buf,0,len));
//			os.write(buf,0,len);
//			os.flush();
//		}
//		dest = os.toByteArray();
//		System.out.println(dest.length); 
//		//释放
//		if(null!=is) {
//			is.close();
//		}
//		if(null!=os) {
//			os.close();
//		}
		
		byte[] bytes =  imageToByteArray("d:/1.psd");
		System.out.println(bytes.length);
		byteArrayToImage(bytes,"d:/my.psd");
	}
	
	public static byte[] imageToByteArray(String path) throws IOException {
		
		File file = new File(path);
		byte[] dest = null;
		
		InputStream is = new FileInputStream(file);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		byte[] buf = new byte[1024];
		int len=0;
		while((len=is.read(buf))!=-1) {
			baos.write(buf,0,len);
			
		}
		baos.flush();
		
		if(null!=is) {
			is.close();
		}
		return baos.toByteArray();
	}
	
	public static void byteArrayToImage(byte[] bytes, String path) throws IOException {
		
		File destFile = new File(path);
		
		InputStream is = new ByteArrayInputStream(bytes);
		OutputStream fos = new FileOutputStream(destFile);
		
		byte[] buf = new byte[1024];
		int len=0;
		while((len=is.read(buf))!=-1) {
			fos.write(buf,0,len);
			fos.flush();
		}
		if(null!=is) {
			is.close();
		}
		if(null!=fos) {
			fos.close();
		}
		
	}
	
}
