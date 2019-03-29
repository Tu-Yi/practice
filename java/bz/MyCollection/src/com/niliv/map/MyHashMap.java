package com.niliv.map;
/**
 * 自己动手实现HashMap
 * 第一版实现功能
 * 构造函数、获取长度、添加、删除、查询、转为字符串，遍历key，后面再继续
 * @author yuankun
 * @param <K> 键泛型
 * @param <V> 值泛型
 * @version 0.1
 */
public class MyHashMap<K,V> {
	
	/**
	 * 默认容量16
	 */
	private static final int DEFAULT_CAPACITY = 1 << 4;
	
	/**
	 * 长度
	 */
	private int size;
	/**
	 * 哈希数组
	 */
	Entry<K, V>[] table;
	
	/**
	 * 空构造器
	 */
	public MyHashMap() {
		table = new Entry[DEFAULT_CAPACITY];
		size = 0;
	}
	
	/**
	 * 键值关系内部类，构造键值关系对象，存储键、值、hash、下一个节点
	 * @author yuankun
	 * @param <K> 键
	 * @param <V> 值
	 */
	private class Entry<K, V>{
		int hash;
		K key;
		V value;
		Entry<K, V> next;
		
		public Entry(int hash, K key, V value, Entry<K, V> next) {
			super();
			this.hash = hash;
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	/**
	 * 添加键值对
	 * 1，计算节点在数组中的位置 key的hashCode对11取余(算法后面再调整，现在先用最简单的)
	 * 2，如果该位置已经有节点，判断是否有相同key的节点，如果有就覆盖值
	 * 3，如果该位置没有节点或没有相同key的节点，则将新节点放入该位置，新节点的next指向原位置节点或null
	 * @param key 键
	 * @param value 值
	 */
	public void put(K key, V value) {
		if(key==null) {
			throw new IllegalArgumentException("键不能为空");
		}
		int hash = key.hashCode() % 11;
		Entry<K, V> newEntry = new Entry<K, V>(hash, key, value, null);
		Entry<K, V> entry = table[hash];
		while(entry!=null) {
			if(entry.key.equals(key)) {
				entry.value =value;
				return;
			}
			entry = entry.next;
		}
		newEntry.next = table[hash];
		table[hash] = newEntry;
		size++;
	}
	/**
	 * 查询 根据哈希值算出数组位置，再匹配是否有相同的key，找到就返回value，否则返回null
	 * @param key 键
	 * @return 值
	 */
	public V get(K key) {
		if(key==null) {
			throw new IllegalArgumentException("键不能为空");
		}
		int hash = key.hashCode() % 11;
		Entry<K, V> entry = table[hash];
		while(entry!=null) {
			if(entry.key.equals(key)) {
				return entry.value;
			}
			entry = entry.next;
		}
		return null;
	}
	/**
	 * 根据key删除键值对
	 * 根据key的hash找到对应数组位置，遍历链表，如果找到了各种相同的key
	 * 将上一个节点prev的next指向当前节点的next，即跳过了当前节点
	 * 此时当前节点没有任何引用指向，它在程序结束之后就会被gc回收
	 * @param key
	 * @return
	 */
	public V remove(K key) {
		if(key==null) {
			throw new IllegalArgumentException("键不能为空");
		}
		int hash = key.hashCode() % 11;
		Entry<K, V> prev = table[hash];  
	    Entry<K, V> e = prev;  
	    while (e != null) {  
	        Entry<K, V> next = e.next;  
	        Object k;  
	        if (e.hash == hash && ((k = e.key) == key || (key != null && key.equals(k)))) {   
	            size--;  
	            if (prev == e)  
	                table[hash] = next;  
	            else  
	                prev.next = next;   
	            return e.value;  
	        }  
	        prev = e;  
	        e = next;  
	    }  
	    return null;  
	}
	/**
	 * 获取长度
	 * @return 长度
	 */
	public int getSize() {
		return this.size;
	}
	/**
	 * 重写toString，遍历哈希数组，遍历链表，获取键值组合字符串
	 */
	@Override
	public String toString() {
		if(size==0) {
			return "[]";
		}
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("[");
		String string = "";
		for (Entry<K, V> entry : table) {
			while(entry!=null) {
				string = string+""+entry.key+":"+entry.value+",";
				entry = entry.next;
			}
		}
		sBuilder.append(string);
		sBuilder.replace(sBuilder.length()-1, sBuilder.length(), "]");
		return sBuilder.toString();
	}
	/**
	 * 获取所有的key的字符串
	 * @return key数组
	 */
	public String getAllKey() {
		if(size==0) {
			return "[]";
		}
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("[");
		String string = "";
		for (Entry<K, V> entry : table) {
			while(entry!=null) {
				string = string+""+entry.key+",";
				entry = entry.next;
			}
		}
		sBuilder.append(string);
		sBuilder.replace(sBuilder.length()-1, sBuilder.length(), "]");
		return sBuilder.toString();
	}
}


