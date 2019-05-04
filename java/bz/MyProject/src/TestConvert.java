import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;

/**
 * 1,字符流的形式操作字节流
 * @author Administrator
 * @Date 2019-04-27 09:46:34
 * @Description 
 *
 */
public class TestConvert {
	public static void main(String[] args) {
		try(BufferedReader isr = 
				new BufferedReader(
						new InputStreamReader(
								new URL("http://www.baidu.com").openStream(),"UTF-8"));
			BufferedWriter bw = 
					new BufferedWriter(
							new OutputStreamWriter(
									new FileOutputStream("baidu.html"),"UTF-8"));
			) {
			
			String msg="";
			while((msg=isr.readLine())!=null) {
				bw.write(msg);
				bw.newLine();
				bw.flush();
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void getall() {
		try(BufferedReader isr = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter osw = new BufferedWriter(new OutputStreamWriter(System.out));
			) {
			String msgString="";
			while(!msgString.equals("exit")) {
				msgString=isr.readLine();
				osw.write(msgString);
				osw.newLine();
				osw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
