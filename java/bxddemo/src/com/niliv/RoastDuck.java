package com.niliv;

public class RoastDuck {
    private String name;
    private int count = 1;
    private boolean flag=false;

    public synchronized void produce(String name){
        while(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name + count;
        count++;
        System.out.println("producer..."+Thread.currentThread().getName()+"..."+this.name);
        flag=true;
        notifyAll();
    }
    public synchronized void consume(){
        while(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("consumer..."+Thread.currentThread().getName()+"..."+this.name);
        flag=false;
        notifyAll();
    }
}
