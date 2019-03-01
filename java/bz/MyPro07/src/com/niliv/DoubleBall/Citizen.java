package com.niliv.DoubleBall;

public class Citizen {
	
	private String name;
	private String id;
	private int[] redNum;
	private int blueNum;
	private double payment;
	
	public Citizen(String name, String id) {
		super();
		this.name = name;
		this.id = id;
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
	
}
