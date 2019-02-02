package com.test;

public class Demo implements Runnable {

    private String name;

    public void run(){
        show();
    }
    public void show(){
        for (int x=0;x<100;x++){
            System.out.println(x+"..."+Thread.currentThread().getName());
        }

    }
}
