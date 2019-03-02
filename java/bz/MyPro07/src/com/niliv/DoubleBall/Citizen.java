package com.niliv.DoubleBall;

/**
 * 公民类
 * @author yuankun
 *
 */
public class Citizen {
	
	//姓名 红球 篮球 总费用 注数 是否购买
	private String name;
	private int[] redNum;
	private int blueNum;
	private double payment;
	private long count;
	private boolean isBuy;
	
	public Citizen() {}
	
	//setter getter方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int[] getRedNum() {
		return redNum;
	}

	public void setRedNum(int[] redNum) {
		this.redNum = redNum;
	}

	public int getBlueNum() {
		return blueNum;
	}

	public void setBlueNum(int blueNum) {
		this.blueNum = blueNum;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public boolean isBuy() {
		return isBuy;
	}

	public void setBuy(boolean isBuy) {
		this.isBuy = isBuy;
	}
	
	
}
