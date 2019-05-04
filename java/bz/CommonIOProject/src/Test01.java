import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import sun.nio.ch.IOUtil;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//文件大小
		long len = FileUtils.sizeOf(new File("d:/c.txt"));
		//目录大小
		len = FileUtils.sizeOf(new File("d:/"));
		//遍历过滤文件
		Collection<File> files = FileUtils.listFiles(
				new File("E:\\my-github\\my-java"), 
				FileFilterUtils.and(new SuffixFileFilter("java"),EmptyFileFilter.NOT_EMPTY),
				DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		//getAll();
		//writeAll();
		//copyAll();
	}
	//逐行读取
	public static void getAll() throws IOException {
		
		String msgString = FileUtils.readFileToString(new File("d:/c.txt"),"utf-8");
		System.out.println(msgString);
		
		byte[] datas = FileUtils.readFileToByteArray(new File("d:/c.txt"));
		System.out.println(datas.length);
		
		List<String> msgs = FileUtils.readLines(new File("d:/c.txt"),"utf-8");
		for (String string : msgs) {
			System.out.println(string);
		}
		
		LineIterator it = FileUtils.lineIterator(new File("d:/c.txt"));
		while(it.hasNext()) {
			System.out.println(it.nextLine());
		}
		
	}
	//写出内容
	public static void writeAll() throws IOException {
		FileUtils.write(new File("d:/c.txt"), "asfasfdasf","UTF-8",true);
		FileUtils.writeStringToFile(new File("d:/c.txt"), "asfasfdasf","UTF-8",true);
		FileUtils.writeByteArrayToFile(new File("d:/c.txt"), "asfasfdasf".getBytes("UTF-8"),true);
		
		List<String> datas = new ArrayList<String>();
		datas.add("123");
		datas.add("123");
		datas.add("123");
		
		FileUtils.writeLines(new File("d:/c.txt"), datas,",,,",true);

	}
	//复制文件
	public static void copyAll() throws IOException{
		
		FileUtils.copyFile(new File("d:/1.psd"), new File("d:/5.psd"));
		FileUtils.copyFileToDirectory(new File("d:/1.psd"), new File("f:/"));
		//FileUtils.copyDirectory(new File("E:\\my-github\\my-java"), new File("F:/my-java"));
		
		FileUtils.copyURLToFile(new URL("https://minatest-1252830662.cos.ap-chengdu.myqcloud.com/mjmf/1555149783879.png"), new File("d:/man.png"));
		
		String datas = IOUtils.toString(new URL("http://www.baidu.com"),"utf-8");
		System.out.println(datas);
	}
}
