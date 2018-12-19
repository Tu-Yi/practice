package com.threaddemo;

/**
 * @author yuankun
 */
public class MainThread {
    public static void main(String args[]){

        Thread t = Thread.currentThread();
        System.out.println("当前线程: "+t.getName()+" | "+t.getId());

        t.setName("MainThread");
        System.out.println("当前线程: "+t.getName()+" | "+t.getId());

        try {

            for(int i=5;i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
