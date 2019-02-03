package com.test;

public class Ticket implements Runnable {

    private int num = 100;
    @Override
    public void run(){
        while (true){
            if(num>0){
                System.out.println(num--);
            }
        }
    }
}
