package com.niliv.thread;

public class TicketR implements Runnable {

	private int num=100;
	@Override
	public void run() {
		while(true) {
			if(num>0) {
				num--;
				System.out.println(Thread.currentThread().getName()+"..."+num);
			}
		}
	}

}
