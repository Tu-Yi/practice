package com.niliv.DoubleBall;

import java.util.Scanner;

/**
 * 执行类
 * @author yuankun
 * @version 0.1
 */
public class DoubleBallMain {

	public static void main(String[] args) {

		//定义全局对象
		Scanner scanner = new Scanner(System.in);
		Citizen citizen = new Citizen();
		Ball ball = new Ball();
		Note[] notes = null;
		//程序执行开始
		do {
			System.out.println("欢迎进入双色球彩票系统[本系统暂只支持单式投注]");
			System.out.println("1.购买彩票");
			System.out.println("2.查看开奖");
			System.out.println("3.退出系统");
			System.out.println("************************");
			//获取菜单选择输入
			String menu;
			do {
				System.out.println("请输入 1  2  3 ，选择你要进行的操作并回车：");
				menu = scanner.nextLine();
			}while(Validation.isEmpty(menu) || !Validation.isINTEGER_NEGATIVE(menu) || Integer.parseInt(menu)<1 || Integer.parseInt(menu)>3);
			
			switch (menu) {
				//购买彩票
				case "1":
					System.out.println();
					System.out.println("******[双色球彩票系统-购买彩票]******");
					//获取姓名输入
					scanner = new Scanner(System.in);
					do {
						System.out.println("请输入您的姓名：");
						citizen.name=scanner.nextLine();
					} while (Validation.isEmpty(citizen.name));
					//获取注数输入
					scanner = new Scanner(System.in);
					String countString;
					do {
						System.out.println("您需要下多少注(请输入大于0的整数)?");
						countString=scanner.nextLine();
					} while (Validation.isEmpty(countString) || !Validation.isINTEGER_NEGATIVE(countString) || Integer.parseInt(countString)==0);
					citizen.count = Integer.parseInt(countString);
					//开始选号
					scanner = new Scanner(System.in);
					//根据注数初始化注类数组,用于存放所有注
					notes = new Note[citizen.count];
					Ball[] balls;
					//按注数顺序选号
					for(int i=0;i<citizen.count;i++) {
						//初始化球类，可装7个球
						balls = new Ball[7];
						System.out.println("******第"+(i+1)+"注选号******");
						//循环7次，获取7个球的号码输入 ，装入Ball对象数组
						for(int j=0;j<7;j++) {
							String numString="";
							if(j!=6) {
								do {
									System.out.println("请输入第*"+(i+1)+"*注的红色球号码(1-33)，第*"+(j+1)+"*个红色球为：");
									numString = scanner.nextLine();
								}while(Validation.isEmpty(numString) || !Validation.isINTEGER_NEGATIVE(numString) || Integer.parseInt(numString)<1 || Integer.parseInt(numString)>33);
								ball = new Ball(Ball.COLOR_RED, Integer.parseInt(numString));
							}else {
								do {
									System.out.println("请输入第"+(i+1)+"注的蓝色球号码(1-16)：");
									numString = scanner.nextLine();
								}while(Validation.isEmpty(numString) || !Validation.isINTEGER_NEGATIVE(numString) || Integer.parseInt(numString)<1 || Integer.parseInt(numString)>16);
								ball = new Ball(Ball.COLOR_BLUE, Integer.parseInt(numString));
							}
							//装入球对象数组
							balls[j] = ball;
						}
						//装入注对象数组
						notes[i] = new Note(citizen, balls,(i+1));
					}
					//此公民已购买
					citizen.isBuy=true;
					//打印购买详情
					System.out.println(citizen.name+"(先生/女士)，您一共买了【"+citizen.count+"】注，共需支付【"+(citizen.count*Note.BALL_PRICE)+"】元，所选号为：");
					for (Note note : notes) {
						System.out.println("第"+note.num+"注");
						for (Ball b : note.balls) {
							System.out.print(b.num + "\t");
						}
						System.out.println();
					}
					System.out.println("----------------------");
					System.out.println();
					break;
				case "2":
					System.out.println();
					System.out.println("******[双色球彩票系统-查看开奖]******");
					//判断是否购买
					if(citizen.isBuy) {
						//查看开奖后，清除购买状态
						citizen.isBuy=false;
						//获取本期开奖双色球
						Ball[] luckBalls = Ball.getLuckNum();
						System.out.print("当期的中奖号为：");
						for (Ball ball2 : luckBalls) {
							System.out.print(ball2.num + "\t");
						}
						System.out.println();
						//循环注数，检查每一注的号码，对比开奖号码
						for(int i=0;i<citizen.count;i++) {
							//打印本注所选的号码
							System.out.println("第"+(i+1)+"注，您的选择是：");
							for (Ball ball2 : notes[i].balls) {
								System.out.print(ball2.num + "\t");
							}
							System.out.println();
							//getCompareResult对比所选号码和开奖号码，返回获奖等级
							switch (Lottery.getCompareResult(notes[i].balls, luckBalls)) {
							case 1:
								System.out.println("第"+(i+1)+"注-->【一等奖】,恭喜你!! 获得奖金【500】万元");
								citizen.sum+=500;
								break;
							case 2:
								System.out.println("第"+(i+1)+"注-->【等奖】,恭喜你!! 获得奖金【400】万元");
								citizen.sum+=400;
								break;
							case 3:
								System.out.println("第"+(i+1)+"注-->【三等奖】,恭喜你!! 获得奖金【300】万元");
								citizen.sum+=300;
								break;
							case 4:
								System.out.println("第"+(i+1)+"注-->【四等奖】,恭喜你!! 获得奖金【200】万元");
								citizen.sum+=200;
								break;
							case 5:
								System.out.println("第"+(i+1)+"注-->【五等奖】,恭喜你!! 获得奖金【100】万元");
								citizen.sum+=100;
								break;
							case 6:
								System.out.println("第"+(i+1)+"注-->【六等奖】,恭喜你!! 获得奖金【10】万元");
								citizen.sum+=10;
								break;
							default:
								System.out.println("很遗憾，第"+(i+1)+"注没有中奖");
								break;
							}
							System.out.println();
						}
						//打印获奖信息
						System.out.println(citizen.name+"(先生/女士)，您一共购买【"+citizen.count+"】注双色球，花费【"+(citizen.count*Note.BALL_PRICE)+"】元");
						System.out.println("您的中奖金额为："+citizen.sum+"元！");
					}else {
						System.out.println("请先购买彩票，再查看开奖情况！");
					}
					System.out.println("-------------------------------------");
					System.out.println();
					break;
				case "3":
					System.out.println("谢谢使用");
					scanner.close();
					return;
				default:
					System.out.println("输入错误");
					scanner.close();
			}
		}while(true);
		
	}

}
