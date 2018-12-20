package com.threaddemo;

public class RunnableDemo implements Runnable {

    private Thread t;
    private String name;

    public RunnableDemo(String name) {
        this.name = name;
        t = new Thread(this,name);
        t.start();
    }

    public void run() {
        try {
            for (int i=5;i>0;i--){
                System.out.println("当前线程: "+name+" | "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("当前线程: "+name+"结束");
    }

    public static void main(String args[]){
        new RunnableDemo("thread-1");
        new RunnableDemo("thread-2");

        try {
            for (int i=5;i>0;i--){
                System.out.println("当前线程: thread-main"+" | "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("当前线程: thread-main"+"结束");
    }
}
