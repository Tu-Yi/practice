package com.niliv.reflect;

public class Person {
	private String name;
	private int age;
	private String post;
	private double salary;
	private double assistance;
	
	public Person() {
		super();
		System.out.println("person run");
	}
	public Person(String name, int age, String post, double salary, double assistance) {
		super();
		this.name = name;
		this.age = age;
		this.post = post;
		this.salary = salary;
		this.assistance = assistance;
	}
	public String getName() {
		System.out.println(this.name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAssistance() {
		return assistance;
	}
	public void setAssistance(double assistance) {
		this.assistance = assistance;
	}
}
