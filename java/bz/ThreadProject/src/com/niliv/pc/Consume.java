package com.niliv.pc;
/**
 * 消费者
 * @author Administrator
 *
 */
public class Consume implements Runnable {

	private Goods goods;
	
	public Consume(Goods goods) {
		super();
		this.goods = goods;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			goods.get();
		}
		
	}
}
