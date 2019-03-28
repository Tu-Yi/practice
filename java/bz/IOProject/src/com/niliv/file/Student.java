package com.niliv.file;

import java.io.Serializable;

public class Student implements Serializable {
	
	/**
	 * xuliehao
	 */
	private static final long serialVersionUID = 5226830560215252280L;
	private String name;
	private int age;
	private static String className;
	private transient String pwd;
	private int sex;
	public Student() {
		super();
	}
	public Student(String name, int age, String pwd) {
		super();
		this.name = name;
		this.age = age;
		this.pwd = pwd;
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
	public static String getClassName() {
		return className;
	}
	public static void setClassName(String className) {
		Student.className = className;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", pwd=" + pwd + ", className=" + className + "]";
	}
	
}
