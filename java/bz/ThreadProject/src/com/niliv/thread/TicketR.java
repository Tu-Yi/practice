package com.niliv.thread;

public class TicketR implements Runnable {

	private int num=10;
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			if(num>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+num--+"张票");
			}
		}
	}

}
