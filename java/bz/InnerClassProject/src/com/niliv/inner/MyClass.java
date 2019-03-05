package com.niliv.inner;

import jdk.internal.dynalink.beans.StaticClass;

public class MyClass {
	
	private String name="MyClass";
	
	//方法中的内部类不能是静态的，也不能有静态成员
	public void show() {
		class Inner{
			int age;
			public void show() {
				System.out.println(name);
			}
		}
		Inner inner = new Inner();
		inner.show();
	}

}
