package com.niliv.string;

public class TestString {
	public static void main(String[] args) {
		
		  String string="abc"; 
		  System.out.println(string); //charAt
		  System.out.println(string.charAt(1)); //equalsIgnoreCase
		  System.out.println(string.equalsIgnoreCase("ABC")); //indexOf
		  System.out.println(string.indexOf('b')); //char自动转换为int
		  System.out.println(string.indexOf("bc")); //字符串
		  System.out.println(string.indexOf(98)); //int
		  System.out.println(string.indexOf('l')); //-1 //lastIndexOf 
		  String string2 ="helloworld"; 
		  System.out.println(string2.indexOf('o',5)); //6
		  System.out.println(string2.lastIndexOf('o',3)); //-1 //反向搜索 //replace 不改变原字符串只操作了方法区的常量池 
		  System.out.println(string2.replace('o', 'p')); //hellpwprld
		  System.out.println(string2); //helloworld //startsWith endsWith
		  System.out.println(string2.startsWith("h")); //true
		  System.out.println(string2.endsWith("d")); //true //substring 不改变原字符串只操作了方法区的常量池
		  System.out.println(string2.substring(3)); //loworld 一直到结尾
		  System.out.println(string2.substring(3,7)); //lowo 含头不含尾
		  System.out.println(string2); //helloworld //toUpperCase toLowerCase 不改变原字符串只操作了方法区的常量池
		  System.out.println(string2.toUpperCase()); //HELLOWORLD
		  System.out.println(string2); //helloworld
		  System.out.println("JAVA".toLowerCase()); //java //trim 去掉前后空格 不改变原字符串只操作了方法区的常量池
		  String string3 = "     hello   world";
		  System.out.println(string3.trim()); //hello world
		  System.out.println(string3); // hello world
		 		
		
		/*compareTo*/
		String aString = "apple";
		String bString = "banana";
		String catString = "cat";
		String aString2 = "app";
		//求两个字符串长度的最小值，循环，比较对应位置上的字母，如果不相同，
		//则返回对应位置字母ASCII的差，如果在最小长度内都相同，则返回两个字符串的长度差
		System.out.println(aString.compareTo(bString)); //-1
		System.out.println(aString.compareTo(catString)); //-2
		System.out.println(aString.compareTo(aString2)); //2
		
		/*String的构造方法*/
		String s1 = new String(); //创建了长度为0的字符串
		String s2=null;//没有对象，只声明了栈变量
		String s3 = new String("hello");
		char[] c= {'a','b','c'};
		String s4 = new String (c);
		byte[] b= {97,98,99};
		String s5=new String(b);
		String s6 = new String(c,0,2);
		String s7 = new String(b,0,2);
		System.out.printf("s1=%s,s2=%s,s3=%s,s4=%s,s5=%s,s6=%s,s7=%s", s1,s2,s3,s4,s5,s6,s7);
		//s1=,s2=null,s3=hello,s4=abc,s5=abc,s6=ab,s7=ab
		
		/*常量池*/
		String str1 = "abc";
		String str2 = "a"+"b"+"c";
		String str3 = new String("abc");
		String str4 = str3+"";
		String str5 = new String("abc");
		System.out.println();
		System.out.println("str1==str2:"+(str1==str2)); //str1==str2:true
		System.out.println("str1==str3:"+(str1==str3)); //str1==str3:false
		System.out.println("str1==str4:"+(str1==str4)); //str1==str3:false
		System.out.println("str1==str5:"+(str1==str5)); //str1==str3:false
		System.out.println("str1==str5:"+(str3==str4));
		
		
		
		
		
		
		
		
	}
}
