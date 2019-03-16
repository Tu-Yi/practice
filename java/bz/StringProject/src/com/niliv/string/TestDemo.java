package com.niliv.string;

import java.util.Arrays;

public class TestDemo {
	public static void main(String[] args) {
//		String string = new String();
//		String string2 = "";
//		System.out.println(string==string2); //false
//		
//		String string3 = "1,2,3,4,5";
//		String[] arr = string3.split(",");
//		System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]
//		
//		String string4 = "abbccdde";
//		System.out.println(Arrays.toString(string4.toCharArray())); //[a, b, b, c, c, d, d, e]
//		
//		String string5 = "abbccdde";
//		byte[] b = string5.getBytes();
//		System.out.println(Arrays.toString(b)); //[97, 98, 98, 99, 99, 100, 100, 101]
//		
//		String string6 = " a b c d ";
//		System.out.println(string6.trim());
		
//		String string = new String("abc");
//		String string2 = string.intern();  //string2="abc";
//		System.out.println(string2);
//		System.out.println(string==string2); //false
		
		//排序
		String[] string = {"ab","bc","ce","cd"};
		Arrays.sort(string);
		System.out.println(Arrays.toString(string));
		
		//查找子串的次数
		String str = "nbasfafsdanbasdfaasnbafafasnbaafd";
		String key = "nba";
		int index = 0;
		int count = 0;
		while((index = str.indexOf(key, index))!=-1) {
			index = index + key.length();
			count++;
		}
		System.out.println(count);
		
		//获取最大子串
		String s1 = "qwerabcdtyuiop";
		String s2 = "xcabcdvbn";
		outer:
		for(int i=0;i<s2.length();i++) {
			for(int a=0,b=s2.length()-i;b!=s2.length()+1;a++,b++) {
				String subString = s2.substring(a,b);
				if(s1.contains(subString)) {
					System.out.println(subString);
					break outer;
				}
			}
		}
		
		//去掉两头空格
		String string2 = "    abc    ";
		int start = 0;
		int end = string2.length()-1;
		
		while(start<=end && string2.charAt(start)==' ') {
			start++;
		}
		while(start<=end && string2.charAt(end)==' ') {
			end--;
		}
		
		System.out.println(string2.substring(start,end+1));
		
		
		
		
	}
}
