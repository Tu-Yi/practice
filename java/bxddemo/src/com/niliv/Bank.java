package com.niliv;

public class Bank {
    private int sum;
    public synchronized void add(int num){
        sum = sum + num;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"...sum="+sum);
    }
}
