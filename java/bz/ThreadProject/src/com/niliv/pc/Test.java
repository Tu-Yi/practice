package com.niliv.pc;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		Goods goods = new Goods();
		Produce produce = new Produce(goods);
		Consume consume = new Consume(goods);
		
		Thread tpThread = new Thread(produce);
		Thread tcThread = new Thread(consume);
		
		tpThread.start();
		Thread.sleep(100);
		tcThread.start();
	}
}
