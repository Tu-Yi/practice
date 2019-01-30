package com.company;

public class Cat extends Animal {
    int num = 80;
    int age = 10;
    public void eat(){
        System.out.println("猫吃饭");
    }
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
    public void cry(){
        System.out.println("喵喵喵！");
    }
    protected void CatTest(){
        System.out.println("cat");
    }
}
