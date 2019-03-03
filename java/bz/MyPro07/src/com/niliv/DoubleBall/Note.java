package com.niliv.DoubleBall;

/**
 * 注类
 * @author yuankun
 * @version 0.1
 */
public class Note {
	//公民、选中的号码、注数、是否中奖、每注价格
	Citizen citizen;
	Ball[] balls;
	int num;
	boolean isLottery;
	static final int BALL_PRICE=2;
	
	public Note(Citizen citizen, Ball[] balls, int num) {
		super();
		this.citizen = citizen;
		this.balls = balls;
		this.num = num;
	}

	public boolean isLottery() {
		return isLottery;
	}

	public void setLottery(boolean isLottery) {
		this.isLottery = isLottery;
	}
	
}
