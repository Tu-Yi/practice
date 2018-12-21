package com.threaddemo;

/**
 * @author yuankun
 * @date 2018.12.21
 * @Description 生产者线程类，调用Guokui资源
 */
public class Product implements Runnable {

    private GuoKui gk;
    private Thread t;

    public Product(GuoKui gk) {
        this.gk = gk;
        t = new Thread(this);
        t.start();
    }

    public void run() {

        for(int i=0;i<10;i++){
            gk.Product("袁琨牌大锅盔");
        }

    }
}
