package com.niliv.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class TestMain {
	
	public static void main(String[] args) {
		
		MyLinkedList<String> myList = new MyLinkedList<String>();
		myList.add("hello");
		myList.add("world");
		System.out.println(myList); //[hello, world]
		System.out.println(myList.getFirstNode()); //hello
		System.out.println(myList.getLastNode()); //world
		myList.addFirstNode("007");
		System.out.println(myList); //[007, hello, world]
		myList.addLastNode("008");
		System.out.println(myList); //[007, hello, world, 008]
		myList.removeFirstNode();
		System.out.println(myList); //[hello, world, 008]
		myList.removeLastNode();
		System.out.println(myList); //[hello, world]
		System.out.println(myList.get(1)); //world
		myList.add(1,"java");
		System.out.println(myList); //[hello, java, world]
		myList.set(1, "sql");
		System.out.println(myList); //[hello, sql, world]
		myList.remove();
		System.out.println(myList); //[sql, world]
		myList.remove(0);
		System.out.println(myList); //[world]
		System.out.println(myList.getLength()); //1
		myList.add(0,"hello");
		System.out.println(myList.toString()); //[hello, world]
		System.out.println(myList.toArray()); //[Ljava.lang.Object;@1554909b
		myList.clear();
		System.out.println(myList); //[]
		
	
	}
}
