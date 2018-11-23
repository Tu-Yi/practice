package com.company;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

        //控制台提示性文字
        System.out.print("请输入一个数");

        //创建Scanner
        String s;
        Scanner reader=new Scanner(System.in);

        s = reader.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String newS = new String(sb);
        if(s.equals(newS)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
	}
}

