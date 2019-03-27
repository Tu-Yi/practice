package com.niliv.list;

import java.util.NoSuchElementException;
import java.util.Arrays;
/**
 * 自己动手实现LinkedList
 * 第一版实现功能
 * 构造函数、获取首节点、获取尾节点、删除首节点、删除尾节点、增加首节点、增加尾节点
 * 根据索引获取节点、添加节点、根据索引添加节点、删除节点、根据索引删除节点、根据索引修改节点
 * 获取节点长度、清空链表、链表转数组、链表转字符串
 * @author yuankun
 *
 * @param <T> 泛型
 */
public class MyLinkedList<T> {
	
	/**
	 * 链表长度
	 */
	private int length=0;
	/**
	 * 首节点
	 */
	private Node<T> firstNode;
	/**
	 * 尾节点
	 */
	private Node<T> lastNode;
	
	/**
	 * 空构造器
	 */
	public MyLinkedList() {
	}
	/**
	 * 插入首节点
	 * 如果当前首节点为空，则将新节点置为首节点和尾节点
	 * 如果当前首节点不为空，则将新节点置为首节点并将原来首节点的前节点置为新节点
	 * @param t 元素
	 */
	private void linkFirstNode(T t){
		Node<T> temp = firstNode;
		Node<T> newFirstNode = new Node<T>(null, temp, t);
		firstNode = newFirstNode;
		if(temp==null) {
			lastNode=newFirstNode;
		}else {
			temp.prev = newFirstNode;
		}
		this.length++;
	}
	/**
	 * 插入尾节点
	 * 如果当前尾节点为空，则将新节点置为首节点和尾节点
	 * 如果当前尾节点不为空，则将新节点置为尾节点并将原来尾节点的后节点置为新节点
	 * @param t 元素
	 */
	private void linkLastNode(T t) {
		Node<T> temp = lastNode;
		Node<T> newLastNode = new Node<T>(temp,null,t);
		lastNode = newLastNode;
		if(temp==null) {
			firstNode = newLastNode;
		}else {
			temp.next = newLastNode;
		}
		this.length++;
	}
	/**
	 * 传入节点前插入新节点
	 * 如果传入节点的前节点为空，则将新节点置为首节点
	 * 如果传入节点的前节点不为空，则将新节点置为前节点的后节点
	 * @param t
	 * @param p
	 */
	private void linkNode(T t, Node<T> p) {
		Node<T> prevNode = p.prev;
		Node<T> newNode = new Node(prevNode,p,t);
		p.prev = newNode;
		if(prevNode==null) {
			firstNode = newNode;
		}else {
			prevNode.next = newNode;
		}
		this.length++;
	}
	/**
	 * 删除不为空的节点 传值之前请确认节点不为空
	 * 如果没有前节点，就把后节点置为首节点，如果有前节点，则把前节点的next置为后节点
	 * 如果没有后节点，就把前节点置为尾节点，如果有后节点，则把后节点的prev置为前节点
	 * @param t 不为空的节点
	 * @return 删除元素的值
	 */
	private T unLinkNode(Node<T> t) {
		T oldNode = t.t;
		Node<T> nextNode = t.next;
		Node<T> prevNode = t.prev;
		if(prevNode!=null) {
			prevNode.next = nextNode;
			t.prev=null;
		}else {
			firstNode = nextNode;
		}
		if(nextNode!=null) {
			nextNode.prev = prevNode;
			t.next=null;
		}else {
			lastNode = prevNode;
		}
		t.t=null;
		this.length--;
		return oldNode;
	}
	/**
	 * 删除不为空的首节点 传值之前请确认节点不为空，同时必须为首节点
	 * 将下一个节点置为首节点
	 * 如果下一个节点为空，则list中没有元素，尾节点也置为空
	 * 如果下一个节点不为空，则将下一个节点的前节点置为空
	 * @param t 不为空的首节点
	 * @return 删除元素的值
	 */
	private T unLinkFirstNode(Node<T> t) {
		T oldNode = t.t;
		Node<T> nextNode = t.next;
		t.t=null;
		t.next=null;
		firstNode=nextNode;
		if(nextNode==null) {
			lastNode=null;
		}else {
			nextNode.prev=null;
		}
		this.length--;
		return oldNode;
	}
	/**
	 * 删除不为空的尾节点 传值之前请确认节点不为空，同时必须为尾节点
	 * 将前一个节点置为尾节点
	 * 如果前一个节点为空，则list中没有元素，首节点也置为空
	 * 如果前一个节点不为空，则将前一个节点的后节点置为空
	 * @param t 不空的尾节点
	 * @return 删除元素的值
	 */
	private T unLinkLastNode(Node<T> t) {
		T oldNode = t.t;
		Node<T> prevNode = t.prev;
		t.t=null;
		t.prev=null;
		lastNode=prevNode;
		if(prevNode==null) {
			firstNode=null;
		}else {
			prevNode.next=null;
		}
		this.length--;
		return oldNode;
	}
	/**
	 * 根据索引搜索节点
	 * 判断索引在前半区还是后半区，分开查找提高效率
	 * @param index
	 * @return
	 */
	private Node<T> index(int index) {
		if(index<0 || index>=this.length) {
			throw new IndexOutOfBoundsException("索引超出范围 "+index);
		}
		if(index<(this.length>>1)) {
			Node<T> x = firstNode;
			for(int i=0;i<index;i++) {
				x = x.next;
			}
			return x;
		}else {
			Node<T> x = lastNode;
			for(int i=this.length-1;i>index;i--) {
				x = x.prev;
			}
			return x;
		}
	}
	/**
	 * 节点类 定义节点，前一个节点，后一个节点
	 * @author yuankun
	 *
	 * @param <T> 泛型
	 */
	private class Node<T>{
		
		Node<T> prev;
		Node<T> next;
		T t;
		public Node(Node<T> prev, Node<T> next, T t) {
			super();
			this.prev = prev;
			this.next = next;
			this.t = t;
		}
		
	}
	/**
	 * 获取首节点,如果为空则抛出异常 
	 * @return 返回首节点的值
	 * @throws NoSuchElementException 首节点为空
	 */
	public T getFirstNode() {
		Node<T> first =firstNode;
		if(first==null) {
			throw new NoSuchElementException("首节点为空");
		}
		return first.t;
	}
	/**
	 * 获取尾节点,如果为空则抛出异常 
	 * @return 返回尾节点的值
	 * @throws NoSuchElementException 尾节点为空
	 */
	public T getLastNode() {
		Node<T> last =lastNode;
		if(last==null) {
			throw new NoSuchElementException("尾节点为空");
		}
		return last.t;
	}
	/**
	 * 删除首节点，为空抛出异常
	 * @return 被删除节点的值
	 * @throws NoSuchElementException
	 */
	public T removeFirstNode() {
		Node<T> first =firstNode;
		if(first==null) {
			throw new NoSuchElementException("首节点为空");
		}
		return unLinkFirstNode(first);
	}
	/**
	 * 删除尾节点，为空抛出异常
	 * @return 被删除节点的值
	 * @throws NoSuchElementException
	 */
	public T removeLastNode() {
		Node<T> last =lastNode;
		if(last==null) {
			throw new NoSuchElementException("尾节点为空");
		}
		return unLinkLastNode(last);
	}
	/**
	 * 增加首节点
	 * @param t 节点
	 */
	public void addFirstNode(T t) {
		linkFirstNode(t);
	}
	/**
	 * 增加尾节点
	 * @param t 节点
	 */
	public void addLastNode(T t) {
		linkLastNode(t);
	}
	/**
	 * 根据索引获取元素
	 * @param index 索引
	 * @return 元素
	 */
	public T get(int index) {
		return index(index).t;
	}
	/**
	 * 添加节点
	 * @param t 节点
	 * @return 成功与否
	 */
	public boolean add(T t) {
		linkLastNode(t);
		return true;
	}
	/**
	 * 根据索引添加节点
	 * @param index 索引
	 * @param t 元素
	 */
	public void add(int index, T t) {
		if(index<0 || index>this.length) {
			throw new IndexOutOfBoundsException("索引超出范围 "+index);
		}
		if(index==this.length) {
			linkLastNode(t);
		}else {
			linkNode(t, index(index));
		}
	}
	/**
	 * 删除元素，默认删除首节点
	 */
	public void remove() {
		removeFirstNode();
	}
	/**
	 * 根据索引删除元素
	 * @param index 索引
	 * @return 被删除元素
	 */
	public T remove(int index) {
		if(index<0 || index>=this.length) {
			throw new IndexOutOfBoundsException("索引超出范围 "+index);
		}
		return unLinkNode(index(index));
	}
	/**
	 * 根据索引修改节点
	 * @param index 索引
	 * @param t 节点
	 * @return 被修改的值
	 */
	public T set(int index, T t) {
		if(index<0 || index>=this.length) {
			throw new IndexOutOfBoundsException("索引超出范围 "+index);
		}
		Node<T> x = index(index);
        T oldNode = x.t;
        x.t = t;
        return oldNode;
	}
	/**
	 * 获取链表长度
	 * @return
	 */
	public int getLength() {
		return this.length;
	}
	/**
	 * 清空链表
	 */
	public void clear() {
		for (Node<T> x = firstNode; x != null; ) {
            Node<T> next = x.next;
            x.t = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        firstNode = lastNode = null;
        this.length = 0;
	}
	/**
	 * 链表转为数组
	 * @return
	 */
	public Object[] toArray() {
        Object[] result = new Object[this.length];
        int i = 0;
        for (Node<T> x = firstNode; x != null; x = x.next)
            result[i++] = x.t;
        return result;
    }
	@Override
	public String toString() {
		if(this.length==0) {
			return "[]";
		}else {
			return Arrays.toString(toArray());
		}
	}
	
}
