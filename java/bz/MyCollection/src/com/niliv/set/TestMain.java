package com.niliv.set;

public class TestMain {
	public static void main(String[] args) {
		MyHashSet<String> myHashSet = new MyHashSet<String>();
		myHashSet.add("hello");
		myHashSet.add("world");
		myHashSet.add("java");
		System.out.println(myHashSet); //[world,java,hello]
		myHashSet.remove("world");
		System.out.println(myHashSet); //[java,hello]
	}
}
