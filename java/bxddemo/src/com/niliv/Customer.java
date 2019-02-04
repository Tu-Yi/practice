package com.niliv;

public class Customer implements Runnable {
    Bank bank = new Bank();
    @Override
    public void run() {
        for (int i=0;i<3;i++){
            //bank也是共享数据，所以要放run外面，但只调了一次，所以不用同步，同步add就行
            bank.add(100);
        }

    }
}
