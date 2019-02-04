package com.niliv;

public class DeadLock implements Runnable {
    public boolean flag;
    DeadLock(boolean flag){
        this.flag = flag;
    }
    @Override
    public void run() {
        if(flag){
            while(true){
                synchronized (MyLock.oLocka){
                    System.out.println(Thread.currentThread().getName()+"---true---oLocka");
                    synchronized (MyLock.oLockb){
                        System.out.println(Thread.currentThread().getName()+"---true---oLockb");
                    }
                }
            }

        }else{
            while (true){
                synchronized (MyLock.oLockb){
                    System.out.println(Thread.currentThread().getName()+"---false---oLockb");
                    synchronized (MyLock.oLocka){
                        System.out.println(Thread.currentThread().getName()+"---false---oLocka");
                    }
                }
            }

        }
    }
}
