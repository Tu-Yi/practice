import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class main {

	public static void main(String[] args) {
		
		
		
//		  //输入半径，求圆的周长和面积 
//		Scanner saScanner = new Scanner(System.in);
//		String radius;
//		do {
//			System.out.println("请输入圆的半径：");
//			radius = saScanner.nextLine();
//		} while (isEmpty(radius) || !isNumeric(radius));
//		System.out.println("该圆的半径为：" + radius);
//		double r = Double.parseDouble(radius);
		Point point = new Point(100, 100);
		Circle circle = new Circle(5,point);
		System.out.println("该圆的面积为："+circle.getArea());
		 
		
		/*输入存款、年限、方式，求出总存款
		 * Scanner saScanner = new Scanner(System.in); System.out.println("请输入存款");
		 * String deposit = saScanner.nextLine(); if(!isEmpty(deposit) &&
		 * isNumeric(deposit)) { System.out.println("请输入存款 方式('活期'或'定期')"); String type
		 * = saScanner.nextLine(); if(!isEmpty(type) && ("活期".equals(type.trim()) ||
		 * "定期".equals(type.trim()))) { System.out.println("请输入存款 年限 1 或 2"); String
		 * year = saScanner.nextLine(); if(!isEmpty(year) && isNumeric(deposit) &&
		 * (year.equals("1") || year.equals("2"))){ double d =
		 * getDeposit(deposit,1,type); System.out.println(d); }else {
		 * System.out.println("请输入正确的年限！"); }
		 * 
		 * }else { System.out.println("请输入正确的存款方式！"); } }else {
		 * System.out.println("请输入正确的存款！"); }
		 */
		
		
		//输入4位正整数，返回每位乘以5并%10,然后交换1，4位，2，3位的结果
//		Scanner s = new Scanner(System.in);
//		int num = 0;
//		do {
//			System.out.print("请输入一个4位正整数：");
//			num = s.nextInt();
//		} while (num < 1000 || num > 9999);
//		getPassword(num);
		
		/*
		 * Scanner saScanner = new Scanner(System.in); String s; do {
		 * System.out.println("请输入本金："); s = saScanner.nextLine(); } while (isEmpty(s)
		 * || !isNumeric(s)); System.out.println("本金为：" + s); double deposit =
		 * Double.parseDouble(s); long hq1 = Math.round(deposit+deposit*(0.35/100));
		 * long hq2 = Math.round(deposit+deposit*(0.35/100)*2); long dq1 =
		 * Math.round(deposit+deposit+deposit*(1.5/100)); long dq2 =
		 * Math.round(deposit+deposit*(2.1/100)*2);
		 * System.out.println("活期一年的本息合计为："+hq1); System.out.println("活期两年的本息合计为："+hq2);
		 * System.out.println("定期一年的本息合计为："+dq1); System.out.println("定期两年的本息合计为："+dq2);
		 */
		 
		
	}
	
	/**
	 * 通过半径获取圆的面积和周长
	 * @author yuankun
	 * @param radius
	 * @return HashMap
	 * @
	 */
	public static HashMap<String, Double> getCircleCal(String radius){
		
		double r = Double.parseDouble(radius);
		final float PI = 3.14f;
		//保留两位小数并四舍五入
		BigDecimal bgPerimeter = new BigDecimal(2 * PI * r).setScale(2, RoundingMode.UP);
		BigDecimal bgArea = new BigDecimal(PI * r * r).setScale(2, RoundingMode.UP);
		
		HashMap<String, Double> circleHashMap=new HashMap<String, Double>();
		if(r>=0) {
			circleHashMap.put("该圆的周长为：perimeter", bgPerimeter.doubleValue());
			circleHashMap.put("该圆的面积为：area", bgArea.doubleValue());
		}
		return circleHashMap;
	}
	
	/**
	 * 求1年或2年的活期定期存款
	 * @param deposit
	 * @param year
	 * @param type
	 * @return
	 */
	public static double getDeposit(String deposit,int year,String type){
		
		double d = Double.parseDouble(deposit);
		double totalDeposit=0;
		BigDecimal bg;
		HashMap<Integer, Double> regularDepHashMap = new HashMap<Integer, Double>();
		regularDepHashMap.put(1, 1.5);
		regularDepHashMap.put(2, 2.1);
		if(type.equals("活期")) {
			bg = new BigDecimal(d*0.35).setScale(2, RoundingMode.UP);
		}else {
			bg = new BigDecimal(d * regularDepHashMap.get(year)).setScale(2, RoundingMode.UP);
		}
		totalDeposit = bg.doubleValue();
		return totalDeposit;
	}
	
	/**
	 * 返回密码
	 * @param num
	 */
	public static void getPassword(int num) {
		int temp;
		int a[] = new int[4];
		a[0] = num / 1000; // 取千位的数字
		a[1] = (num/100)%10; //取百位的数字
		a[2] = (num/10)%10; //取十位的数字
		a[3] = num%10;   // //取个位的数字
		for(int j=0;j<4;j++){
			a[j]+=5;
			a[j]%=10;
		}
		for(int j=0;j<=1;j++){
			temp =a[j];
			a[j] = a[3-j];
			a[3-j] =temp;
		}
		System.out.print("加密后的数字为：");
		for(int j=0;j<4;j++) {
			System.out.print(a[j]);
		}
	}
	
	//判断字符串是否为空
	public static boolean isEmpty(String str) {
        return null == str || "".equals(str.trim());
    }
	//判断是否为正数
	public static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("^\\d+$|^\\d+\\.\\d+$");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
	}

}
