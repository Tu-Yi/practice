package com.threaddemo;

public class Sell_Guokui {

    public static void main(String args[]){

        GuoKui gk = new GuoKui();

        new Product(gk);
        new Consumer(gk);
    }
}
