package com.company;

public class Employee {
    String name;
    int age;
    double salary;
    public Employee(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary=salary;
    }
    public  void printEmployee(){
        System.out.println("名字："+name);
        System.out.println("年龄："+age);
        System.out.println("工资："+salary);
    }
}
