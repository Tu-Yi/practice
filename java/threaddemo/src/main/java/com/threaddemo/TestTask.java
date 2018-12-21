package com.threaddemo;

public class TestTask  {


    public static void main(String args[]){

        // 启动3个线程，都会去访问Test_Output资源
        Test_Output output = new Test_Output();
        Test_Thread t1 =  new Test_Thread("Hello",output);
        Test_Thread t2 =  new Test_Thread("Word",output);
        Test_Thread t3 =  new Test_Thread("yuankun",output);

        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
