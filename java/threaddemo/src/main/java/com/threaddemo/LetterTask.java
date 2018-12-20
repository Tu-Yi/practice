package com.threaddemo;

/**
 * @author yuankun
 */
public class LetterTask implements Runnable {

    private Thread t;
    private String name;
    private char startLetter;
    private char endLetter;

    public LetterTask(String name, char startletter, char endLetter) {
        this.name = name;
        this.startLetter = startletter;
        this.endLetter = endLetter;
        t= new Thread(this,name);
        t.start();
    }

    public void run() {
        try {

            for(char a=startLetter;a <=endLetter;a++){
                System.out.println("当前进程："+name+" | "+a);
                Thread.sleep(100);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前进程："+name+" is exit");
    }

    public static void main(String args[]){

        new LetterTask("thread-uppercase",'A','Z');
        new LetterTask("thread-lower",'a','z');

        try {
            for(int i=1;i<=100;i++){
                System.out.println("当前进程：thread-main"+" | "+i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前进程：thread-main"+" is exit");
    }
}
