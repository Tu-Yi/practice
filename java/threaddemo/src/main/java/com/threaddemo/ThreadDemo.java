package com.threaddemo;

public class ThreadDemo extends Thread {

    private String threadName;
    private Thread t;

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
        t = new Thread(this,threadName);
        t.start();
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


    public static void main(String args[]){
//        new ThreadDemo("thread-1");
//        new ThreadDemo("thread-2");
//        try {
//            for(int i=5;i>0;i--){
//                System.out.println("当前线程： thread-main"+" | "+i);
//                Thread.sleep(1000);
//            }
//        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("当前线程： "+"thread-main"+" | "+"结束");

        for(char a='a';a <='z';a++){
            System.out.println(a);
        }
    }
}
