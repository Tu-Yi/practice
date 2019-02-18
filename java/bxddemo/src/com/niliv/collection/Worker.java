package com.niliv.collection;

public class Worker extends Person {

	public Worker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.getName()+":"+this.getAge();
	}

}
