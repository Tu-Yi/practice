package com.niliv.timing;

/**
 * 使用thread线程来实现定时效果
 * 线程执行的时候一直循环，每次循环都有sleep，实现定时效果
 * 不方便设置第一次执行时间
 * @author yuankun
 *
 */
public class TaskWhile {
	
	public static void main(String[] args) {
		//18.10分的时候执行，时间间隔1天
		final long timeInterval = 10000;
		Runnable runnable = new Runnable() {
			public void run() {
				while (true) {
					
					System.out.println("task begin:" + "(*^__^*) 嘻嘻，我又来了！！"+"2019-03-30 18:10:00");
	                try {
	                    Thread.sleep(10 * 20);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                System.out.println("task   end:" + "(*^__^*) 嘻嘻，我又走了！！"+"2019-03-30 18:12:00");
	                
					try {
						Thread.sleep(timeInterval);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		System.out.println("main start:" + "2019-03-30 16:25:36");
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
