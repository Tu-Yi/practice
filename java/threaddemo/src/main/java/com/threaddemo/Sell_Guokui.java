package com.threaddemo;

/**
 * @author yuankun
 * @date 2018.12.21
 * @Description 执行类
 */
public class Sell_Guokui {

    public static void main(String args[]){

        GuoKui gk = new GuoKui();

        new Product(gk);
        new Consumer(gk);
    }
}
