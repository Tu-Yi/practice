package com.threaddemo;

public class ThreadDemo extends Thread {

    private String threadName;
    private Thread t;

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run(){
        doLoop(threadName);
        System.out.println("当前线程： "+threadName+" | "+"结束");

    }

    private void doLoop(String name){
        try {
            for(int i=5;i>0;i--){
                System.out.println("当前线程： "+name+" | "+i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Start(){
        if(t==null){
            t = new Thread(threadName);
            t.start();
        }
    }

    public static void main(String args[]){
        ThreadDemo r1 = new ThreadDemo("thread-1");
        r1.start();
        r1.doLoop("thread-main");
        System.out.println("当前线程： "+"thread-main"+" | "+"结束");
    }
}
