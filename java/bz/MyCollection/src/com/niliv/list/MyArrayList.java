package com.niliv.list;

import java.util.Arrays;

/**
 * 自己动手实现ArrayList
 * 第一版：实现功能
 * 构造函数、获取长度、判断是否为空、转换数组、清除方法、根据索引查询、根据索引修改、添加元素方法、根据索引删除、扩容、转换字符串
 * @author yuankun
 * @version 0.1
 * 
 */
public class MyArrayList<T> {
	
	/**
	 * 第一次添加元素时，默认扩容大小
	 */
	private final static int DEFAULT_ARRAY_SIZE = 10;
	/**
	 * 数组容量最大值
	 */
	private final static int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
	/**
	 * 数组
	 */
	private Object[] arrayData;
	/**
	 * 空数组
	 */
	private Object[] EMPTY_ARRAY = {};
	/**
	 * 数组长度
	 */
	private int length;
	/**
	 * 空构造函数，返回空数组
	 */
	public MyArrayList(){
		this.arrayData = EMPTY_ARRAY;
	}
	/**
	 * 构造指定长度的空数组
	 * @param x  长度
	 * @throws IllegalArgumentException 长度非法
	 */
	public MyArrayList(int x) {
		if(x>0) {
			this.arrayData = new Object[x];
		}else if (x==0) {
			this.arrayData = EMPTY_ARRAY;
		}else {
			throw new IllegalArgumentException("非法长度 "+x);
		}
	}
	/**
	 * 获取长度
	 * @return 长度
	 */
	public int getLength() {
		return this.length;
	}
	/**
	 * 判断是否为空
	 * @return 为空返回true，不为空返回false
	 */
	public boolean isEmpty() {
		return this.length==0;
	}
	/**
	 * list转成数组
	 * @return Object数组
	 */
	public Object[] toArray() {
		return Arrays.copyOf(this.arrayData, this.length);
	}
	/**
	 * 根据索引获取数据
	 * @param x 索引
	 * @return 返回数组
	 */
	private T getArrData(int x) {
		return (T)arrayData[x];
	}
	/**
	 * 检查索引范围，如果非法则抛出异常
	 * @param x 索引
	 * @throws IndexOutOfBoundsException 索引超出范围
	 */
	private void checkRange(int x) {
		if(x>=this.length || x<0) {
			throw new IndexOutOfBoundsException("索引超出范围 "+x);
		}
	}
	/**
	 * 根据索引获取数据
	 * @param x 索引
	 * @return 数据
	 */
	public T get(int x) {
		checkRange(x);
		return getArrData(x);
	}
	/**
	 * 根据索引修改数据，返回修改前数据
	 * @param x 索引
	 * @param newEle 新数据
	 * @return 修改前数据
	 */
	public T set(int x, T newEle) {
		checkRange(x);
		T oldEle = getArrData(x);
		arrayData[x] = newEle;
		return oldEle;
	}
	/**
	 * 确定数组长度
	 * @param x 需要长度
	 */
	private void confirmArrayLength(int x) {
		int minLength;
		if(arrayData == EMPTY_ARRAY) {
			minLength = Math.max(DEFAULT_ARRAY_SIZE, x);
		}else {
			minLength = x;
		}
		if(minLength-arrayData.length>0) {
			Expansion(minLength);
		}
	}
	/**
	 * 数组扩容
	 * @param minLength 需要长度
	 */
	private void Expansion(int minLength) {
		int oldLength = arrayData.length;
		int newLength = oldLength + (oldLength >> 1);
		if((newLength-minLength)<0) {
			newLength = minLength;
		}
		if(newLength - MAX_ARRAY_SIZE >0) {
			newLength = isExtendMax(minLength);
		}
		arrayData = Arrays.copyOf(arrayData,newLength);
	}
	/**
	 * 判断是否超出数值范围
	 * @param minLength 需要长度
	 * @throws 超出内存范围
	 * @return 新长度
	 */
	private int isExtendMax(int minLength) {
		if(minLength<0) {
			throw new OutOfMemoryError("超出内存范围");
		}
		return (minLength>MAX_ARRAY_SIZE)?Integer.MAX_VALUE:this.MAX_ARRAY_SIZE;
	}
	
	/**
	 * 添加元素，根据数组大小判断是否需要扩容
	 * @param t 元素
	 * @return 是否成功
	 */
	public boolean add(T t) {
		confirmArrayLength(this.length+1);
		this.arrayData[this.length++] = t;
		return true;
	}
	/**
	 * 根据索引删除元素
	 * @param x 索引
	 * @return 被删除元素
	 */
	public T remove(int x) {
		checkRange(x);
		T oldData = getArrData(x);
		int moveNum = this.length - x -1;
		if(moveNum>0) {
			System.arraycopy(arrayData, x+1, arrayData, x, moveNum);
		}
		arrayData[--this.length] = null;
		return oldData;
	}
	/**
	 * 清空集合
	 */
	public void clear() {
		for(int i=0;i<this.length;i++) {
			arrayData[i] = null;
		}
		this.length=0;
	}
	/**
	 * 返回字符串形式
	 */
	@Override
	public String toString() {
		return this.length==0?"[]":Arrays.toString(Arrays.copyOfRange(arrayData,0,this.length));
	}
	
}
