package com.niliv.staticproxy;

public class Test {
	public static void main(String[] args) {
		Me me = new Me();
		MarryCompany mc = new MarryCompany(me);
		mc.start();
	}
}
