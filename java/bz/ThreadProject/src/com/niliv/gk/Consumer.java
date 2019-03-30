package com.niliv.gk;
/**
 * 消费者
 * @author yuankun
 *
 */
public class Consumer implements Runnable {
	
	private GuoKui gk;
	
	public Consumer(GuoKui gk) {
		this.gk = gk;
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			gk.consume();
		}
	}
	
	
}
