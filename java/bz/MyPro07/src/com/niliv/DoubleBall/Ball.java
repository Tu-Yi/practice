package com.niliv.DoubleBall;

public class Ball {
	
	private String color;
	private int num;
	
	public Ball(String color,int num) {
		this.color = color;
		this.num = num;
	}
	
	public int[] rockNumber_red() {
		int[] rockNum = new int[6];
		for(int i=0;i<rockNum.length;i++) {
			rockNum[i] = random(33);
		}
		return rockNum;
	}
	
	public int rockNumber_blue() {
		return random(16);
	}
	
	private int random(int range) {
		return  (int)(33*Math.random()+1);
	}
}
