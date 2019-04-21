package com.niliv.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		test1(); //普通对象：323
		test2(); //反射对象：4324
		test3(); //反射对象取消检查：3791
	}
	private static void test1() {
		Person person = new Person();
		long startTime = System.currentTimeMillis();
		for(int i =0;i<1000000000L;i++) {
			person.getName();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("普通对象："+(endTime-startTime));
	}
	private static void test2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class person = Class.forName("com.niliv.reflect.Person");
		Method hs = person.getDeclaredMethod("getName", null);
		
		long startTime = System.currentTimeMillis();
		for(int i =0;i<1000000000L;i++) {
			hs.invoke(person.newInstance(), null);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("反射对象："+(endTime-startTime));
	}
	private static void test3() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		Class person = Class.forName("com.niliv.reflect.Person");
		Method hs = person.getDeclaredMethod("getName", null);
		Person p = (Person)person.newInstance();
		hs.setAccessible(true);
		long startTime = System.currentTimeMillis();
		for(int i =0;i<1000000000L;i++) {
			hs.invoke(p, null);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("反射对象取消检查："+(endTime-startTime));
	}
}
