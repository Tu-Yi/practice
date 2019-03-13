import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		
		//创建文件
		File file = new File("D:\\a.txt");
		File file1 = new File("a.txt");
		File file2 = new File("D:/dir");
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		
		System.out.println(file.getName());
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		
		System.out.println(file.createNewFile());
		System.out.println(file1.createNewFile());
		System.out.println(file2.createNewFile());
		
		//创建目录
		File file3 = new File("D:\\test\\aa\\bb");
		file3.mkdirs();
		File parentFile = file3.getParentFile();
		file3.delete();
		parentFile.delete(); //目录下没有东西才能删除
		
		//遍历目录
		File file4 = new File("D:\\");
		File[] files = file4.listFiles();
		for (File f : files) {
			System.out.println(f);
		}
		System.out.println("-----------------------------");
		String[] strFileStrings = file4.list();
		for (String string : strFileStrings) {
			System.out.println(string); //文件名，没有盘符
		}
		
	}
}
