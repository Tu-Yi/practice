package com.niliv.map;

public class TestMain {
	public static void main(String[] args) throws InterruptedException {
		
		MyHashMap<String, String> map = new MyHashMap<String, String>();
		map.put("one", "旺财");
		map.put("two", "小强");
		map.put("three", "百战程序员");
		System.out.println(map); //[three:百战程序员,one:旺财,two:小强]
		System.out.println("one"+":"+map.get("one")); //one:旺财
		Thread.sleep(200);
		System.out.println(map.remove("two"));  //小强
		System.out.println(map.get("two")); //null
		System.out.println(map); //[three:百战程序员,one:旺财]
	}
}
