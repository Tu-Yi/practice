package com.niliv.exp1;

import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) throws ScoreOutOfRangeException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的数量：");
		int num = scanner.nextInt();
		int i=0;
		int sum=0;
		do {
			System.out.println("请输入第"+(i+1)+"个学生的分数：");
			int score = scanner.nextInt();
			if(score<0) {
				throw new ScoreOutOfRangeException("分数必须是正数或者0");
			}
			sum+=score;
			i++;
		}while(i<num);
		System.out.println("平均分是："+Math.round(sum/num));
	}
}
