package com.niliv.thread;

public class Test {
	public static void main(String[] args) throws InterruptedException {
//		Ticket t1 = new Ticket();
//		Ticket t2 = new Ticket();
//		Ticket t3 = new Ticket();
//		Ticket t4 = new Ticket();
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
		
//		TicketR tR =new TicketR();
//		Thread t1 = new Thread(tR,"卖票窗口1");
//		Thread t2 = new Thread(tR,"卖票窗口2");
//		Thread t3 = new Thread(tR,"卖票窗口3");
//		Thread t4 = new Thread(tR,"卖票窗口4");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
		
		TicketR tR =new TicketR();
		Thread t1 = new Thread(tR,"卖票窗口1");
		t1.setPriority(3);
		t1.start();
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				//t1.join();  //阻塞主线程，使t1执行结束后再执行主线程
				//Thread.sleep(2000); //使线程处于阻塞状态
				//Thread.yield(); //礼让一次，失去执行资格，处于就绪状态
				//Thread.stop() //停止线程，已过时
			}
			System.out.println(Thread.currentThread().getName()+"...."+i);
		}
	}
}
