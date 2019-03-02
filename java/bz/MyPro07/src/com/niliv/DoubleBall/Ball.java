package com.niliv.DoubleBall;
/**
 * 双色球类
 * @author yuankun
 *
 */
public class Ball {
	
	//颜色、球号、每注单价
	private String color;
	private int num;
	static final int BALL_PRICE=2;
	
	public Ball() {}
	
	public Ball(String color,int num) {
		this.color = color;
		this.num = num;
	}
	//随机生成6位红球 范围1-33
	public int[] rockNumber_red() {
		int[] rockNum = new int[6];
		for(int i=0;i<rockNum.length;i++) {
			rockNum[i] = random(33);
		}
		return rockNum;
	}
	//随机生成1位蓝球 范围1-16
	public int rockNumber_blue() {
		return random(16);
	}
	
	private int random(int range) {
		return  (int)(33*Math.random()+1);
	}
}
