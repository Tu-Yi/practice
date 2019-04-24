import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestArrayStream {
	public static void main(String[] args) throws IOException {
		//创建源
		byte[] src = "talk is cheap show me the code".getBytes();
		byte[] dest=null;
		//选择流
		InputStream is = new ByteArrayInputStream(src);
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		//操作
		int temp=0;
		int len=0; //每次实际接收长度
		byte[] buf = new byte[1024]; //缓冲容器 每次循环可以接收长度
		
		while((len=is.read(buf))!=-1) {
			System.out.println(new String(buf,0,len));
			os.write(buf,0,len);
			os.flush();
		}
		dest = os.toByteArray();
		System.out.println(dest.length); 
		//释放
		if(null!=is) {
			is.close();
		}
		if(null!=os) {
			os.close();
		}
	}
}
