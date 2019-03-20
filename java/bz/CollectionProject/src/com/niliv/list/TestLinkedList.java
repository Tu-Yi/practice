package com.niliv.list;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("java");
		list.addFirst("hello");
		list.addLast("world");
		
		list.removeLast();
		list.removeFirst();
		
		System.out.println(list);
	}
}
