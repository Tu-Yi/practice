package com.niliv;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
//        Ticket t = new Ticket();
//        Thread t1 = new Thread(t);
//        Thread t2 = new Thread(t);
//        Thread t3 = new Thread(t);
//        Thread t4 = new Thread(t);
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

//        Customer cus = new Customer();
//        Thread t1 = new Thread(cus);
//        Thread t2 = new Thread(cus);
//
//        t1.start();
//        t2.start();

//        DeadLock dl1 = new DeadLock(true);
//        DeadLock dl2 = new DeadLock(false);
//        Thread t1 = new Thread(dl1);
//        Thread t2 = new Thread(dl2);
//        t1.start();
//        t2.start();

//        Resource r = new Resource();
//        Input in = new Input(r);
//        Output ot = new Output(r);
//
//        Thread tInput = new Thread(in);
//        Thread tOutput = new Thread(ot);
//
//        tInput.start();
//        tOutput.start();

//        RoastDuck rd = new RoastDuck();
//        DuckProductor dp = new DuckProductor(rd);
//        DuckConsumer dc = new DuckConsumer(rd);
//
//        Thread t0 = new Thread(dp);
//        Thread t1 = new Thread(dp);
//        Thread t2 = new Thread(dc);
//        Thread t3 = new Thread(dc);
//
//        t0.start();
//        t1.start();
//        t2.start();
//        t3.start();

        StopThread st = new StopThread();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);

        t1.start();
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        Thread.sleep(1000);
        st.setFlag();

//        int num=1;
//        for(;;){
//            if(++num==50){
//
//                break;
//            }
//            System.out.println(Thread.currentThread().getName()+num);
//        }


    }
}
