package com.niliv.collection;

import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList模拟队列和堆栈
 */
public class LinkedListSQ {
	
	private LinkedList link;
	private String type;
	
	public LinkedListSQ() {
		this.link = new LinkedList();
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void myAdd(Object obj) {
		this.link.addLast(obj);
	}
	
	public Object myPop() {
		if(this.type == "stack") {
			return this.link.removeLast();
		}else {
			return this.link.removeFirst();
		}
		
	}
	
	public boolean isNull() {
		return this.link.isEmpty();
	}

}
