package com.niliv.collection;

public class Student extends Person {

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.getName()+":"+this.getAge();
	}

}
