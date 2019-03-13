import java.io.File;
/**
 * 树状结构展示目录
 * @author yuankun
 * @version 0.1
 */
public class FilesTree {
	public static void main(String[] args) {
		//定义遍历目录
		File file = new File("G:\\test\\my-java");
		PrintFiles(file, 0);
	}
	public static void PrintFiles(File file, int level) {
		//打印分隔符
		for(int i=0;i<level;i++) {
			System.out.print("-");
		}
		//打印文件名
		System.out.println(file.getName());
		//判断是否是目录
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				//递归遍历
				PrintFiles(f, level+1);
			}
		}
	}
}
