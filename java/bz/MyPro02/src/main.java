import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int i1 = 13; int i8 = 015; int i16 = 0x15; int i2 = 0b1101; long l =
		 * 783923942394923492L; float f = 3.14f; double d = 6.28;
		 * System.out.println(String.format("%d,%d %d %d", i1,i8,i16,i2));
		 * 
		 * BigDecimal bd = BigDecimal.valueOf(1.0); bd =
		 * bd.subtract(BigDecimal.valueOf(0.1)); bd =
		 * bd.subtract(BigDecimal.valueOf(0.1)); bd =
		 * bd.subtract(BigDecimal.valueOf(0.1)); bd =
		 * bd.subtract(BigDecimal.valueOf(0.1)); bd =
		 * bd.subtract(BigDecimal.valueOf(0.1)); System.out.println(bd);//0.5
		 * System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);//0.5000000000000001
		 * 
		 * System.out.println('a'+'b'); //195
		 */

		/*
		 * long l = 1 + 2L; byte b = 1; int myI = b + 2; double d = 0.1f + 0.2; float f
		 * = 0.1f +0.2f;
		 * 
		 * int a=3; a *= b+3; System.out.println(a); //15
		 * 
		 * char c1='a'; char c2='b'; System.out.println(c1>c2); //false
		 * 
		 * int a1 = 6370; a1 = a1 / 1000; System.out.println(a1); //6
		 */

//		System.out.println(String.format("%d %d %d", 7%3,-7%3,7%-3)); //1 -1 1

		/*
		 * int a = 10; int b = ++a; System.out.println("a="+a+",b="+b); //a=11,b=10
		 */

		/*
		 * int a = 1; int b = 2; a+=b; System.out.println(a); //3 a*=b+2; // a= a *
		 * (b+2) System.out.println(a); //12 a/=b; System.out.println(a); //6 a%=b;
		 * System.out.println(a); //0
		 * 
		 * 
		 * 
		 * 
		 * 
		 * int a = 10,b=20;
		 * 
		 * System.out.println(a-b); //-10
		 * 
		 * 
		 * //1>2的结果为false，那么整个表达式的结果即为false，将不再计算2>(3/0) boolean c = 1>2 && 2>(3/0);
		 * //false System.out.println(c);
		 * //1>2的结果为false，那么整个表达式的结果即为false，还要计算2>(3/0)，0不能做除数，//会输出异常信息 boolean d = 1>2
		 * & 2>(3/0); //Exception in thread "main" java.lang.ArithmeticException: / by
		 * zero System.out.println(d);
		 */

		/*
		 * int a=3; int b=4; System.out.println(a&b); System.out.println(a|b);
		 * System.out.println(a^b^b); System.out.println(a>>1);
		 * System.out.println(a<<1);
		 */

//		int score = 80;
//		String typeString = score<60?"涓嶅強鏍�":"鍙婃牸";
//		System.out.println(typeString);

		/*
		 * int a = 12; short s = 12; s=a; //Type mismatch: cannot convert from int to
		 * short long l = 23.1f; //cannot convert from float to long float f =
		 * 123123123l; System.out.println(s);
		 */

		/*
		 * int year = 20; int money = 1000000000; int total = year * money;
		 * System.out.println(total); //-1474836480 int total1 = year * (long)money;
		 * System.out.println(total1); //20000000000
		 */

		/*
		 * Scanner sa = new Scanner(System.in); System.out.println("璇疯緭鍏ュ悕瀛楋細"); String
		 * nameString = sa.nextLine(); System.out.println("璇疯緭鍏ュ勾榫勶細"); String age =
		 * sa.nextLine();
		 * 
		 * System.out.println("******************"); System.out.println(nameString);
		 */

		/*
		 * System.out.println(16>>2); //4 16/(2*2) System.out.println(3<<2); //12 3*
		 * (2*2) System.out.println(6&3); //2 System.out.println(6|3); //7
		 * System.out.println(6^3); //5 System.out.println(~6); //-7
		 */		
		/*
		 * int a = 6; char c = 'a'; System.out.println(a + c); // 103
		 * System.out.println(a + c + ""); // 103 System.out.println("" + a + c); // 6a
		 * System.out.println(a + "" + c); // 6a
		 */		
		
		/*输入半径，求圆的周长和面积
		 * Scanner saScanner = new Scanner(System.in); System.out.println("请输入圆的半径");
		 * String radius = saScanner.nextLine(); if(!isEmpty(radius) &&
		 * isNumeric(radius)) { HashMap<String, Double> circleMap =
		 * getCircleCal(radius); System.out.println("该圆的半径为：radius="+radius); for
		 * (String string : circleMap.keySet()) {
		 * System.out.println(string+":"+circleMap.get(string)); } }else {
		 * System.out.println("输入的半径必须是0或正数！"); }
		 */
		
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
		
		/*
		 * char c = '1'; System.out.println(Character.getNumericValue(c)+5);
		 * 
		 * String a ="4567"; System.out.println(getPassword(a));
		 */
		
		/*输入4位正整数，返回每位乘以5并%10,然后交换1，4位，2，3位的结果
		 * Scanner s = new Scanner(System.in); int num = 0; do {
		 * System.out.print("请输入一个4位正整数："); num = s.nextInt(); } while (num < 1000 ||
		 * num > 9999); getPassword(num);
		 */
		
	}
	public static boolean isEmpty(String str) {
        return null == str || "".equals(str.trim());
    }
	public static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("^\\d+$|^\\d+\\.\\d+$");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
	}
	
	/**
	 * strives for the area and perimeter of the circle
	 * @author niliv
	 * @param radius
	 * @return HashMap
	 * @
	 */
	public static HashMap<String, Double> getCircleCal(String radius){
		
		double r = Double.parseDouble(radius);
		final float PI = 3.14f;
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


}
