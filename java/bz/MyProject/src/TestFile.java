import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		
		String path = "d:/a.txt";
		//构建File对象
		File file = new File(path);
		File file2 = new File("d:/","a.txt");
		System.out.println(file.length());
		
		//路径
		System.out.println(System.getProperty("user.dir"));
		//E:\my-github\practice\java\bz\MyProject
		file = new File("a.txt"); //不存在也可以构建file对象
		System.out.println(file.getAbsolutePath()); 
		//E:\my-github\practice\java\bz\MyProject\a.txt
		
		testFileApi();
		testDirApi();
	}
	
	private static void testFileApi() throws IOException {
		String path = "d:/a.txt";
		File file = new File(path);
		File file2 = new File("a.txt");
		//基本信息
		System.out.println(file.getName()); //a.txt
		System.out.println(file.getPath()); //d:\a.txt  路径是什么就是什么
		System.out.println(file.getAbsolutePath()); //d:\a.txt  永远是绝对路径
		System.out.println(file.getParent()); //d:\
		//状态
		System.out.println(file.exists()); //true
		System.out.println(file.isFile()); //true
		System.out.println(file.isDirectory()); //false
		System.out.println(file2.exists()); //false
		System.out.println(file2.isFile()); //false
		System.out.println(file2.isDirectory()); //false
		
		System.out.println(file.length()); //7  文件不存在或是文件夹，这个length的长度为0
		
		boolean flag =  file2.createNewFile(); //不存在则创建
		System.out.println(flag); //true
		
		flag = file2.delete();
		System.out.println(flag); //true 删除已经存在的
	}
	/*
	 * mkdir 上级目录不存在则报错
	 * mkdirs 上级目录可以不存在，不存在则一同创建
	 */
	private static void testDirApi() {
		
		File dir = new File("d:/b");
		boolean flag = dir.mkdirs();
		System.out.println(flag);
		
		System.out.println("---------------------");
		File dirFile = new File("E:\\my-github\\my-java");
		String[] names = dirFile.list();
		for (String string : names) {
			System.out.println(string);
		}
		System.out.println("---------------------");
		File[] files = dirFile.listFiles();
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
	}
	//统计文件夹的大小
	private static void getAllFile() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
