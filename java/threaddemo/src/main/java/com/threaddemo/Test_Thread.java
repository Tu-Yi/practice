package com.threaddemo;

/**
 * @author yuankun
 * 线程类，定义线程的实现，并在run里调用Test_Ouput对象的输出方法
 */
public class Test_Thread implements Runnable {

    private String msg;
    private Test_Output outPut;
    protected Thread t;

    public Test_Thread(String msg, Test_Output outPut) {
        this.msg = msg;
        this.outPut = outPut;
        t = new Thread(this);
        t.start();
    }

    public void run() {

        outPut.outPut(msg);

    }
}
