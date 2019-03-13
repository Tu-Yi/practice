package com.niliv.actor;

public abstract class Actor {
	
	protected String name;
	protected int age;
	protected String sex;
	
	
	
	public Actor(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	


	public Actor() {
		super();
	}



	abstract void performance();
}
