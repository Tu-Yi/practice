package com.niliv.DoubleBall;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import sun.security.provider.JavaKeyStore.CaseExactJKS;

/**
 * 执行类
 * @author yuankun
 * @version 0.1
 */
public class DoubleBallMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Citizen citizen = new Citizen();
		Ball ball = new Ball();
		System.out.println("欢迎进入双色球彩票系统[本系统暂只支持单式投注]");
		System.out.println("1.购买彩票");
		System.out.println("2.查看开奖");
		System.out.println("3.退出系统");
		System.out.println("************************");
		String menu;
		do {
			System.out.println("请输入 1  2  3 ，选择你要进行的操作并回车：");
			menu = scanner.nextLine();
		}while(Validation.isEmpty(menu) || !Validation.isINTEGER_NEGATIVE(menu) || Integer.parseInt(menu)<1 || Integer.parseInt(menu)>3);
		
		switch (menu) {
		case "1":
			System.out.println("[双色球彩票系统-购买彩票]");
			//获取姓名
			Scanner sName = new Scanner(System.in);
			do {
				System.out.println("请输入您的姓名：");
				citizen.name=sName.nextLine();
			} while (Validation.isEmpty(citizen.name));
			//获取注数
			Scanner sCount = new Scanner(System.in);
			String countString;
			do {
				System.out.println("您需要下多少注(请输入大于0的整数)?");
				countString=sCount.nextLine();
			} while (Validation.isEmpty(countString) || !Validation.isINTEGER_NEGATIVE(countString) || Integer.parseInt(countString)==0);
			citizen.count = Integer.parseInt(countString);
			//选号
			Scanner sBall = new Scanner(System.in);
			Note[] notes = new Note[citizen.count];
			Ball[] balls;
			for(int i=0;i<citizen.count;i++) {
				balls = new Ball[7];
				System.out.println("******第"+(i+1)+"注选号******");
				for(int j=0;j<7;j++) {
					String numString="";
					if(j!=6) {
						do {
							System.out.println("请输入第*"+(i+1)+"*注的红色球号码(1-33)，第*"+(j+1)+"*个红色球为：");
							numString = sBall.nextLine();
						}while(Validation.isEmpty(numString) || !Validation.isINTEGER_NEGATIVE(numString) || Integer.parseInt(numString)<1 || Integer.parseInt(numString)>33);
						ball = new Ball(Ball.COLOR_RED, Integer.parseInt(numString));
					}else {
						do {
							System.out.println("请输入第"+(i+1)+"注的蓝色球号码(1-16)：");
							numString = sBall.nextLine();
						}while(Validation.isEmpty(numString) || !Validation.isINTEGER_NEGATIVE(numString) || Integer.parseInt(numString)<1 || Integer.parseInt(numString)>16);
						ball = new Ball(Ball.COLOR_BLUE, Integer.parseInt(numString));
					}
					balls[j] = ball;
				}
				notes[i] = new Note(citizen, balls,(i+1));
			}
			System.out.println(citizen.name+"(先生/女士)，您一共买了【"+citizen.count+"】注，共需支付【"+(citizen.count*Note.BALL_PRICE)+"】元，所选号为：");
			for (Note note : notes) {
				System.out.println("第"+note.num+"注");
				for (Ball b : note.balls) {
					System.out.print(b.num + "\t");
				}
				System.out.println();
			}
			citizen.isBuy=true;
			System.out.println();
			break;
		case "2":
			System.out.println("[双色球彩票系统-查看开奖]");
			if(citizen.isBuy) {
				
			}else {
				System.out.println("请先购买彩票，再查看开奖情况！");
			}
			break;
		default:
			break;
		}
		
	}

}
