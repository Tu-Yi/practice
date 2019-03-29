package com.niliv.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestTreeMap {
	public static void main(String[] args) {
		
//		HashMap<String, String> hashMap = new HashMap<String, String>();
//		hashMap.put("1", "one");
//		hashMap.put("2", "two");
//		ArrayList<Map.Entry<String,String>> arrayList = new ArrayList<Map.Entry<String,String>>();
//		Set<Map.Entry<String,String>> entry = hashMap.entrySet();
//		Iterator<Map.Entry<String,String>> it = entry.iterator();
//		while(it.hasNext()) {
//		    Map.Entry<String,String> me = it.next();
//		    arrayList.add(me);
//		}
		
//		TreeSet<Goods> goods = new TreeSet<Goods>();
//		goods.add(new Goods(12, "洗脚盆", 21.2, "人民超市"));
//		goods.add(new Goods(13, "洗脚盆1", 21.2, "人民超市"));
//		goods.add(new Goods(14, "洗脚盆2", 21.2, "人民超市"));
//		goods.add(new Goods(12, "洗脚盆", 21.2, "人民超市"));
//		System.out.println(goods);
		
		listToMap();
		
	}
	public static void listToMap() {
		ArrayList<Goods> aList = new ArrayList<Goods>();
		aList.add(new Goods(12, "洗脚盆", 21.2, "人民超市"));
		aList.add(new Goods(13, "洗脚盆1", 22.2, "人民超市1"));
		aList.add(new Goods(14, "洗脚盆2", 23.2, "人民超市2"));
		System.out.println(aList);
		
		HashMap<Integer, Goods> map = new HashMap<Integer, Goods>();
		Iterator<Goods> it = aList.iterator();
		while(it.hasNext()) {
			Goods good = it.next();
			map.put(good.getNum(), good);
		}
		System.out.println(map);
		
		ArrayList<GoodEntry<Integer, Goods>> aList2 = new ArrayList<TestTreeMap.GoodEntry<Integer,Goods>>();
		Set<Map.Entry<Integer, Goods>> entry = map.entrySet();
		Iterator<Map.Entry<Integer, Goods>> its = entry.iterator();
		while(its.hasNext()) {
			Map.Entry<Integer, Goods> me = its.next();
			GoodEntry<Integer, Goods> gEntry = new GoodEntry(me.getKey(), me.getValue());
			aList2.add(gEntry);
		}
		System.out.println(aList2);
	}
	static class GoodEntry<Integer, Goods>{
		
		Integer key;
		Goods value;
		public GoodEntry(Integer key, Goods value) {
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			return "GoodEntry [key=" + key + ", value=" + value + "]";
		}
		
	}
}
