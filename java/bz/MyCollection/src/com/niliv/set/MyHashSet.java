package com.niliv.set;

import com.niliv.map.MyHashMap;
/**
 * 自己动手实现HashSet
 * 第一个版本实现功能
 * 构造函数、获取长度、添加、删除、转换字符串，后面再继续
 * @author yuankun
 * @version 0.1
 *
 * @param <K> 泛型
 */
public class MyHashSet<K> {
	
	/**
	 * 底层使用HashMap来实现
	 */
	private MyHashMap<K, Object> map;
	/**
	 * 默认值
	 */
	private static final Object DEFALUT_V = new Object(); 
	/**
	 * 空构造函数
	 */
	public MyHashSet() {
		map = new MyHashMap<>();
	}
	/**
	 * 获取长度
	 * @return 长度
	 */
	public int size() {
		return map.getSize();
	}
	/**
	 * 添加，调用MyHashMap的put方法添加key，值为默认值
	 * @param key
	 */
	public void add(K key) {
		map.put(key, DEFALUT_V);
	}
	/**
	 * 删除，调用MyHashMap的remove方法，返回被删除的值，即为默认值
	 * @param key
	 * @return
	 */
	public boolean remove(K key) {
		return map.remove(key) == DEFALUT_V;
	}
	/**
	 * toString
	 */
	@Override
	public String toString() {
		return map.getAllKey();
	}
}
