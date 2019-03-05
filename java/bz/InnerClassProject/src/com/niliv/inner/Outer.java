package com.niliv.inner;

public class Outer {
	
	static String name;
	
	//静态内部类才能访问外部类的静态成员
	static class Inner{
		public void show() {
			System.out.println(Outer.name);
		}
	}
	//内部类中有静态成员，内部类也必须是静态的
	static class Inner2{
		public static void show() {
			System.out.println(Outer.name);
		}
	}

}
