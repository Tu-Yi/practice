package com.niliv;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RoastDuck {
    private String name;
    private int count = 1;
    private boolean flag=false;
    Lock lock = new ReentrantLock();
    Condition pro_con = lock.newCondition();
    Condition com_con = lock.newCondition();

    public void produce(String name){
        lock.lock();
        try {
            while(flag){
                try {
                    pro_con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.name = name + count;
            count++;
            System.out.println("producer5.0..."+Thread.currentThread().getName()+"..."+this.name);
            flag=true;
            com_con.signal();
        }finally {
            lock.unlock();
        }

    }
    public void consume(){
        lock.lock();
        try {
            while(!flag){
                try {
                    com_con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("consumer5.0..."+Thread.currentThread().getName()+"..."+this.name);
            flag=false;
            pro_con.signal();
        }finally {
            lock.unlock();
        }

    }
}
