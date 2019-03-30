package com.niliv.thread;

public class Test {
	public static void main(String[] args) {
//		Ticket t1 = new Ticket();
//		Ticket t2 = new Ticket();
//		Ticket t3 = new Ticket();
//		Ticket t4 = new Ticket();
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
		
		TicketR tR =new TicketR();
		Thread t1 = new Thread(tR);
		Thread t2 = new Thread(tR);
		Thread t3 = new Thread(tR);
		Thread t4 = new Thread(tR);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
