package com.niliv;

public class StopThread implements Runnable {
    private boolean flag=true;
    @Override
    public void run() {
        while(flag){
            System.out.println(Thread.currentThread()+"....");
        }
    }
    public void setFlag(){
        flag=false;
    }
}
