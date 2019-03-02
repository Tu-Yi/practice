package com.niliv.DoubleBall;
/**
 * 双色球类
 * @author yuankun
 *
 */
public class Ball {
	
	//颜色、球号、每注单价
	String color;
	int num;
	static final String COLOR_RED="red";
	static final String COLOR_BLUE="blue";
	
	public Ball() {}
	
	public Ball(String color,int num) {
		this.color = color;
		this.num = num;
	}
	/**
	 * 随机生成一个中奖号
	 * @return
	 */
	public static int[] getLuckNum(){
		int luckNum[]=new int[7];
		for(int i=0;i<luckNum.length;i++){
			if(i<luckNum.length-1){//红球
				luckNum[i]=(int)(Math.random()*33)+1;//生成一个1-33的随机数
			}else{//蓝球
				luckNum[i]=(int)(Math.random()*16)+1;//生成一个1-16的随机数
			}
		}
		return luckNum;
	}
}
