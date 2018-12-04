package com.company;


public abstract class Animal {

    int num = 10;

    public void eat(){
        System.out.println("动物吃饭");
    }

    public abstract void cry();
}
