import  java.util.Scanner;

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
		 * long l = 1 + 2l; int b = 2; double f = 0.1f + 0.2;
		 * 
		 * int a=3; a *= b+3; System.out.println(a); //15
		 * 
		 * char c1='a'; char c2='b'; System.out.println(c1>c2); //false
		 */	
		
		/*
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
//		String typeString = score<60?"不及格":"及格";
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
		
		Scanner sa = new Scanner(System.in);
		System.out.println("请输入名字：");
		String nameString = sa.nextLine();
		System.out.println("请输入年龄：");
		String age = sa.nextLine();
		
		System.out.println("******************");
		System.out.println(nameString);
		
	}

}
