package com.threaddemo;

/**
 * @author yuankun
 * @date 2018.12.21
 * @Description 锅盔资源类-每次只提供一个锅盔
 */
public class GuoKui {

    private int counter = 0;
    private String name;
    private boolean flag = false;

    // 生产者
    public synchronized void Product(String name){

        // 如果有锅盔则等待消费
        if(flag){
            try {

                this.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //生产锅盔
        counter++;
        this.name = name + counter;
        flag = true;
        System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name+" | 有锅盔了快来买！");
        notifyAll();

    }
    // 消费者
    public synchronized void consume(){

        // 没有锅盔就等待生产
        if(!flag){
            try {

                this.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false;
        System.out.println(Thread.currentThread().getName()+"...消费者..."+this.name+" | 锅盔被买走！");
        notifyAll();

    }
}
