import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 命令行打印日历
 * @author yuankun
 * @version 0.1
 */
public class PrintCalendar {

	public static void main(String[] args) throws ParseException {
		
		//获取日期输入
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入日期：(yyyy-mm-dd)");
		String inputString = scanner.next();
		
		//获取日历对象
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(inputString);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		
		//获取输入日期
		int inputDate = calendar.get(Calendar.DAY_OF_MONTH);
		
		//获取当月1号的星期数
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		int dayOfweek = calendar.get(Calendar.DAY_OF_WEEK);
		
		//获取当月天数
		int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		
		//打印1号前的空号
		for(int i=1;i<dayOfweek;i++) {
			System.out.print("\t");
		}
		
		//打印日期
		for(int i=1;i<=maxDay;i++) {
			System.out.print(i);
			if(i==inputDate) {
				System.out.print("*");
			}
			System.out.print("\t");
			if(calendar.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
				System.out.println();
			}
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}

	}

}
