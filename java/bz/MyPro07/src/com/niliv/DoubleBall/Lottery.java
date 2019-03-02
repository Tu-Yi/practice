package com.niliv.DoubleBall;

/**
 * 开奖类
 * @author yuankun
 *
 */
public class Lottery {
	
	//中奖球号
	int[] red_luckNum;
	int blue_luckNum;
	
	public Lottery(int[] red_luckNum, int blue_luckNum) {
		super();
		this.red_luckNum = red_luckNum;
		this.blue_luckNum = blue_luckNum;
	}



	public int getCompareResult(Citizen c) {
		
		//中奖等级、红球相等数、蓝球相等数
		int luckLevel=0;
		int redEqualCount=0;
		boolean isBlue=false;
		
		//我下注的红球和蓝球
		int[] c_redNum = c.getRedNum();
		int c_blueNum = c.getBlueNum();
		
		//比较相等球数
		for(int i=0;i<c_redNum.length;i++) {
			int r = c_redNum[i];
			for(int j=0;j<this.red_luckNum.length;j++) {
				if(r==this.red_luckNum[j]) {
					redEqualCount++;
				}
			}
		}
		if(c.getBlueNum() == this.blue_luckNum) {
			isBlue=true;
		}
		//判断中奖等级
		if(redEqualCount==6&&isBlue) {
			luckLevel=1;
		}else if(redEqualCount==6) {
			luckLevel=2;
		}else if(redEqualCount==5&&isBlue) {
			luckLevel=3;
		}else if(redEqualCount==5 || (redEqualCount==4&&isBlue)) {
			luckLevel=4;
		}else if(redEqualCount==4 || (redEqualCount==3&&isBlue)) {
			luckLevel=5;
		}else if(isBlue) {
			luckLevel=6;
		}
		
		return luckLevel;
	}
}
