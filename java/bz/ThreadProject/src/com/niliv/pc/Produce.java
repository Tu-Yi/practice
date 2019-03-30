package com.niliv.pc;
/**
 * 生产者
 * @author Administrator
 *
 */
public class Produce implements Runnable {

	private Goods goods;
	
	public Produce(Goods goods) {
		this.goods = goods;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				goods.set("北京", "烤鸭");
			}else {
				goods.set("成都", "兔头");
			}
			System.out.println("生产者生产了"+goods.getBrand()+goods.getName());
		}
	}
}
