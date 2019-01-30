package com.company;

public class Outer {

    private int num = 3;


    public void method(){

        new Animal(){
            public void cry(){
                System.out.println("niming");
            }
        }.cry();
    }
}
