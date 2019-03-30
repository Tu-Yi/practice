package com.niliv.gk;
/**
 * 生产者
 * @author yuankun
 *
 */
public class Producer implements Runnable{

	private GuoKui gk;
	
	public Producer(GuoKui gk) {
		this.gk = gk;
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			gk.produce("锅盔");
		}
	}

}
