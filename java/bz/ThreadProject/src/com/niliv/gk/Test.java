package com.niliv.gk;

public class Test {
	
	public static void main(String[] args) {
		GuoKui gKui = new GuoKui();
		
		Producer p = new Producer(gKui);
		Consumer c = new Consumer(gKui);
		
		Thread tP = new Thread(p);
		Thread tP1 = new Thread(p);
		Thread tC = new Thread(c);
		Thread tC1 = new Thread(c);
		
		tP.start();
		tP1.start();
		tC.start();
		tC1.start();
	}
}
