package com.niliv.map;

public class TestMain {
	public static void main(String[] args) throws InterruptedException {
		
		MyHashMap<String, String> map = new MyHashMap<String, String>();
		map.put("one", "旺财");
		map.put("two", "小强");
		map.put("three", "百战程序员");
		System.out.println(map);
		System.out.println("one"+":"+map.get("one"));
		Thread.sleep(200);
		System.out.println(map.remove("two")); 
		System.out.println(map.get("two"));
	}
}
