package com.company;

public class Object_demo1 extends Object{
    private int age;

    public Object_demo1(int age) {
        this.age = age;
    }

    public boolean equals(Object o){
        Object_demo1 od = (Object_demo1)o;
        return this.age == od.age;
    }
    public int hashCode(){
        return this.age;
    }
}
