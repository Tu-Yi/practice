package com.niliv.collection;


public class Person extends Object implements Comparable<Person> {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
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
//	//覆盖hashCode和equals方法
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) {
//			return true;
//		}
//		if(!(obj instanceof Person)) {
//			throw new ClassCastException("类型错误！");
//		}
//		System.out.println(this+"..equals.."+obj);
//		Person p = (Person)obj;
//		return this.name.equals(p.name) && this.age == p.age;
//	}
//	@Override
//	public int hashCode() {
//		System.out.println(name+"|"+age+"...hashCode=" + (name.hashCode()+age*35));
//		return name.hashCode()+age*35;
//	}
	@Override
	public int compareTo(Person p) {
		
		
		//Person p =(Person)o;
		int temp = this.age-p.age;
		return temp==0?this.name.compareTo(p.name):temp;
		
//		if(this.age>p.age) {
//			return 1;
//		}
//		if(this.age<p.age) {
//			return -1;
//		}
//		if(this.age==p.age) {
//			this.name.compareTo(p.name);
//		}
		
	}
}
