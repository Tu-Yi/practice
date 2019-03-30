package com.niliv.staticproxy;

public class MarryCompany implements Marryable{

	private Marryable ma;
	public MarryCompany(Marryable ma) {
		this.ma = ma;
	}
	public void start() {
		System.out.println("婚庆公司开始准备");
		marry();
		System.out.println("婚庆公司开始善后");
	}
	@Override
	public void marry() {
		ma.marry();
	}

}
