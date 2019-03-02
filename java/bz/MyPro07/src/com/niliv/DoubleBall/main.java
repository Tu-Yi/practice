package com.niliv.DoubleBall;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

/**
 * 执行类
 * @author yuankun
 * @version 0.1
 */
public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Citizen citizen = new Citizen();
		Ball ball = new Ball();
		System.out.println("欢迎进入双色球彩票系统");
		System.out.println("1.购买彩票");
		System.out.println("2.查看开奖");
		System.out.println("3.退出系统");
		System.out.println("************************");
		System.out.println("请选择你要进行的操作并回车");
		int menu = scanner.nextInt();
		switch (menu) {
		case 1:
			System.out.println("[双色球彩票系统-购买彩票]");
			Scanner sName = new Scanner(System.in);
			do {
				System.out.println("请输入您的姓名：");
				citizen.setName(sName.nextLine());
			} while (Validation.isEmpty(citizen.getName()));
			System.out.println("您的姓名是：" + citizen.getName());
			
			Scanner sCount = new Scanner(System.in);
			do {
				System.out.println("您需要下多少注?");
				citizen.setCount(sCount.nextInt());
			} while (Validation.isEmpty(citizen.getCount()+"") || !Validation.isINTEGER_NEGATIVE(citizen.getCount()+""));
			citizen.setPayment(citizen.getCount() * ball.BALL_PRICE);
			System.out.println("您下了：" + citizen.getCount()+"注,下注总金额为："+(int)citizen.getPayment()+"元");
			break;
		default:
			break;
		}
		
	}

}
