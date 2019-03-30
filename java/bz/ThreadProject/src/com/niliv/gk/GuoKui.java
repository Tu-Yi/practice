package com.niliv.gk;
/**
 * 共享对象
 * @author yuankun
 *
 */
public class GuoKui {
	
	private String name;
	public int count;
	private boolean isFlag;
	/**
	 * 生产
	 * @param name
	 */
	public synchronized void produce(String name) {
		while(isFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		count++;
		this.name = name + count + "号";
		System.out.println("生产了锅盔"+this.name+"等待消费");
		isFlag=true;
		notifyAll();
	}
	/**
	 * 消费
	 */
	public synchronized void consume() {
		while(!isFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("消费了锅盔"+this.name+"等待生产");
		isFlag=false;
		notifyAll();
	}
}
