package com.company;

public class Human {
    static int number=0; //类变量
    private  final String name;// final必须初始化或者构造函数初始化
    private   int weight; //private修饰符只能在本类中访问

    // 构造函数1
    public Human(){
        this.name="default";
        this.weight=100;
        number += 1;
    }
    // 构造函数2
    public Human(String name,int weight){
        this.name=name;
        this.weight=weight;
    }

    // 设置name的值
    public void setName(String name){
        name = name;
    }
    //获取name的值
    public  String getName(){
        return  this.name;
    }

    //设置weight的值
    public void setWeight(int weight){
        weight = weight;
    }
    //获取weight的值
    public  int getWeight(){
        return this.weight;
    }

    //获取number的值
    public static int getNumber(){
        return number;
    }
    //设置number的值
    public static void setNumber(int number) {
        Human.number = number;
    }

    //方法 改变weight的值
    public int workout(){
        weight = weight-5;
        return  weight;
    }

    //静态方法 调用构造函数初始化值
    public static Human newHuman(String name,int weight){
        return  new Human(name,weight);
    }



}
