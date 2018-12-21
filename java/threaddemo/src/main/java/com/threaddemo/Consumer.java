package com.threaddemo;

/**
 * @author yuankun
 * @date 2018.12.21
 * @Description 消费者线程类，调用Guokui资源
 */
public class Consumer implements Runnable {

    private GuoKui gk;
    private Thread t;

    public Consumer(GuoKui gk) {
        this.gk = gk;
        t = new Thread(this);
        t.start();
    }

    public void run() {

        for(int i=0;i<10;i++){

            gk.consume();

        }

    }
}
