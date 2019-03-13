//静态导入
import static java.lang.Math.*;
public class TestMath {
	public static void main(String[] args) {
		//返回1-10的随机数
		System.out.println((int)(random()*9)+1);
		//四舍五入取整
		System.out.println(round(3.1415));
		//取最值
		System.out.println(max(1, 2.1));
	}
}
