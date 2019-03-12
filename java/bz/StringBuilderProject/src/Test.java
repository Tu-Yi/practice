import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Test {
	public static void main(String[] args) throws ParseException {
		
//		String string = "";
//		StringBuilder sBuilder1 = new StringBuilder();
//		sBuilder1.append(string);
//		for(int i=0;i<10;i++) {
//			sBuilder1.append(i);
//		}
//		System.out.println(sBuilder1.toString());
//		
//		StringBuilder sBuilder = new StringBuilder();
//		for(int i=0;i<10;i++) {
//			sBuilder.append(i);
//		}
//		System.out.println(sBuilder);
		
		Date date = new Date();
		System.out.println(date); //Tue Mar 12 12:57:25 CST 2019
		
		Date date1 = new Date(1001L);
		System.out.println(date1); //Thu Jan 01 08:00:01 CST 1970
		
		//比较时间
		System.out.println(date1.getTime()>date.getTime()); //false
		System.out.println(date1.before(date)); //true
		System.out.println(date1.after(date)); //false
		System.out.println(date1.compareTo(date)); //-1
		System.out.println(date1.equals(date)); //false
		
		//日期转字符串
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDateString = format.format(date);
		System.out.println(strDateString); //2019-03-12 13:17:58
		//字符串转日期
		String string = "2019-03-12 13:17:58";
		Date date3 = format.parse(string);
		System.out.println(date3); //Tue Mar 12 13:17:58 CST 2019
		
		
		//获取北京时间
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
        Date date2 = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = dateFormat.format(date2);
        System.out.println(dateString); //2019-03-12 13:17:59
		
	}
}
