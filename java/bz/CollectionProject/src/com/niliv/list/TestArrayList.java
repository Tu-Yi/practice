package com.niliv.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestArrayList {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		//add
		list.add("hello");
		list.add("world");
		//AbstractCollection中定义了toString直接输出数组格式
		System.out.println(list); //[hello, world]
		
		//size
		System.out.println(list.size()); //2
		//empty
		System.out.println(list.isEmpty()); //false
		
		//add addAll
		List list2 = new ArrayList();
		list2.add("hello");
		list2.add(123); //自动装箱
		list.addAll(list2);
		System.out.println(list); //[hello, world, hello, 123]
		
		//remove removeAll
		list.remove("hello");
		System.out.println(list); //[world, hello, 123]
		//list.remove(123);  //java.lang.IndexOutOfBoundsException
		list.remove(new Integer(123));
		System.out.println(list); //[world, hello]
		list.remove(0);
		System.out.println(list); //[hello]
		System.out.println(list2); //[hello, 123]
		list.add("world");
		list.add(123);
		list.removeAll(list2); //删除交集
		System.out.println(list);
		
		//retainAll
		list.add("hello");
		list.add(123);
		System.out.println(list);
		list.retainAll(list2); //交集
		System.out.println(list2);
		System.out.println(list); //[hello, 123]
		
		//contains containsAll
		list.add("world");
		System.out.println(list.contains(123)); //true
		System.out.println(list.containsAll(list2)); //true
		
		//clear
		list2.clear();
		System.out.println(list2); //[]
		
		//get
		System.out.println(list); //[hello, 123, world]
		System.out.println(list.get(0)); //hello
		//set
		list.set(1, 456);
		System.out.println(list); //[hello, 456, world]
		//add
		list.add(1,true);
		System.out.println(list); //[hello, true, 456, world]
		//indexOf
		System.out.println(list.indexOf(true)); //1
		
		//foreach
		for (Object object : list) {
			System.out.println(object);
		}
		//for
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//iterator
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//listIterator
		ListIterator iterator2 = list.listIterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		while(iterator2.hasPrevious()) {
			System.out.println(iterator2.previous());
		}
		
	}
}
