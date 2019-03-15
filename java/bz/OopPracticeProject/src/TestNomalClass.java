import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestNomalClass {
	public static void main(String[] args) throws ParseException {
//		Scanner scanner = new Scanner(System.in);
//		String string;
//		do {
//			System.out.println("请输入用户名(长度大于6，不能包含数字)：");
//			string = scanner.nextLine();
//		}while("".equals(string.trim()) || string.length()<=6 || hasDigit(string));
//		System.out.println(string);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入年龄：");
//		String strAge = scanner.nextLine();
//		System.out.println("请输入分数：");
//		String strScore = scanner.nextLine();
//		System.out.println("请输入入学时间(yyyy-MM-dd)：");
//		String strStartingDate = scanner.nextLine();
//		
//		Integer iAge = new Integer(strAge);
//		Double dScore = new Double(strScore);
//		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		Date startingDate = format.parse(strStartingDate);
//		
//		System.out.println("年龄："+iAge+";分数："+dScore+";入学时间："+format.format(startingDate));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入信号灯颜色（红，黄，绿）：");
		String linString = scanner.nextLine();
		switch (linString) {
		case "红":
			System.out.println(Light.停车);
			break;
		case "黄":
			System.out.println(Light.慢行);
			break;
		case "绿":
			System.out.println(Light.行驶);
			break;
		default:
			break;
		}
		
	}
	//判断字符串是否包含数字
	public static boolean hasDigit(String content) {  
		boolean flag = false;  
		Pattern p = Pattern.compile(".*\\d+.*");  
		Matcher m = p.matcher(content);  
		if (m.matches())  
		flag = true;  
		return flag;  
	}  
}
