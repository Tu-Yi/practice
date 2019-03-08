import java.util.Scanner;

public class TestException {
	static String string;
	
	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		try {
//			System.out.println("输入除数");
//			int num1 = scanner.nextInt();
//			System.out.println("输入被除数");
//			int num2 = scanner.nextInt();
//			double result = num1 / num2;
//			System.out.println(num1+"/"+num2+"="+result);
//		} catch (Exception e) {
//			System.err.println("除数不能为0");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("finally");
//		}
		
//		System.out.println(string.length());
		
		int a = 2;
		if(a==1) {
			System.out.println("正确");
		}else {
			try {
				throw new MyException("哈麻皮");
			} catch (MyException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
		}
	}
}
