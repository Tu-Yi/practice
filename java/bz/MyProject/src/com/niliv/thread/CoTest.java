package com.niliv.thread;

public class CoTest {
	
	public static void main(String[] args) {
		
	}
	
}
//生产者
class Productor extends Thread{
	
	SynContainer container;
	public Productor(SynContainer container) {
		this.container = container;
	}
	public void run() {
		for(int i=0;i<100;i++) {
			
		}
	}
}
//消费者
class Consumer extends Thread{
	SynContainer container;
	public  Consumer(SynContainer container) {
		this.container = container;
	}
	
}
//缓冲区
class SynContainer{
	Steam[] buns = new Steam[10];
	int count=0;
	public void push(Steam bun) {
		buns[count] = bun;
		count++;
	}
	public Steam pop() {
		count--;
		Steam bun = buns[count];
		return bun;
	}
}
//馒头
class Steam{
	
}