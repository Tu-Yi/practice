package com.company;

public class Mann extends Person {

    public Mann() {
        System.out.println("i am Mann constructor");
        this.age = 1;
        System.out.println(this.age);
        System.out.println(super.age);
    }



    /**
     * 对属性的封装
     * 丈夫的私有属性
     */
    private Wife wife;
    protected  int sex;
    /**
     * 私有对象对外开放的接口，丈夫肯定不能开放getWife接口
     */
    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
