package com.niliv.list;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class TestIterator {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("java");
		arrayList.add("hello");
		arrayList.add("world");
		
		//Iterator<String> ite = arrayList.iterator();
		/*
		 * private class Itr implements Iterator<E> {
	        int cursor;       // index of next element to return
	        int lastRet = -1; // index of last element returned; -1 if no such
	        int expectedModCount = modCount;
	
	        Itr() {}
	
	        public boolean hasNext() {
	            return cursor != size;
	        }
	
	        @SuppressWarnings("unchecked")
	        public E next() {
	            checkForComodification();
	            int i = cursor;
	            if (i >= size)
	                throw new NoSuchElementException();
	            Object[] elementData = ArrayList.this.elementData;
	            if (i >= elementData.length)
	                throw new ConcurrentModificationException();
	            cursor = i + 1;
	            return (E) elementData[lastRet = i];
	        }
	      }
		 * */
//		while(ite.hasNext()) {
////			if(ite.next().equals("hello")) {
////				arrayList.add("sql");  //java.util.NoSuchElementException
////			}
//			System.out.println(ite.next());
//		}
		
		ListIterator<String> it = arrayList.listIterator();
		while(it.hasNext()) {
			String string = it.next();
			if("hello".equals(string))
				it.add("sql");
		}
		System.out.println(arrayList);
	}
}
