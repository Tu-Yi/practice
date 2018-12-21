package com.threaddemo;

/**
 * @author yuankun
 * 共享资源类：使用synchronized修饰方法，只允许一个线程使用此资源，JVM释放后下一个线程才能进入
 */
public class Test_Output {

    synchronized void outPut(String msg){

        // synchronized(this){} 也可以修饰代码块达到相同的效果
        System.out.print("["+msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");

    }

}
