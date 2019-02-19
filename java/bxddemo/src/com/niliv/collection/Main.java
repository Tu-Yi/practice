package com.niliv.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
//        Collection coll = new ArrayList();
//        coll.add("abc1");
//        coll.add("abc2");
//        coll.add("abc3");
//        System.out.println(coll); //[abc1, abc2, abc3]
//        coll.remove("abc3");
//        System.out.println(coll); //[abc1, abc2]
//        System.out.println(coll.contains("abc3")); //false
//        System.out.println(coll.size()); //2
//        System.out.println(coll.isEmpty()); //false
//        System.out.println(Arrays.toString(coll.toArray())); //[abc1, abc2]
//
//        Collection c1 = new ArrayList();
//        Collection c2 = new ArrayList();
//        c1.add("a1");
//        c1.add("a2");
//        c1.add("a3");
//        c2.add("a2");
//        c2.add("a3");
//        c2.add("a4");

//        c1.addAll(c2);
//        System.out.println(c1); //[a1, a2, a3, a2, a3, a4]
//        c1.removeAll(c2);
//        System.out.println(c1); //[a1] 閸掔娀娅庢禍銈夋肠
//        c1.retainAll(c2);
//        System.out.println(c1); //[a2, a3] 閸欐牔姘﹂梿锟�
//        System.out.println(c1.containsAll(c2)); //false

//        Iterator it = c1.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next()); //a1 a2 a3
//        }

//        for(Iterator it =c1.iterator(); it.hasNext();){
//            System.out.println(it.next()); //a1 a2 a3
//        }

//        List list = new ArrayList();
//        list.add("abc1");
//        list.add("abc2");
//        list.add("abc3");

//        list.add(1,"abc9");
//        System.out.println(list); //[abc1, abc9, abc2, abc3]

//        System.out.println(list.remove(2)); //abc3

//        System.out.println(list.set(1,"abc8")); //abc2

//        System.out.println(list.get(1)); //abc2

//        System.out.println(list.subList(1,2)); //[abc2]

//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        //list閻楄婀侀崣鏍э拷鍏兼煙瀵拷
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            Object obj = it.next();
//            //java.util.ConcurrentModificationException
//            //閸︺劏鍑禒锝堢箖缁嬪鑵戞稉宥堫洣娴ｈ法鏁ら梿鍡楁値閹垮秳缍旈崗鍐閿涘苯顔愰弰鎾冲毉閻滄澘绱撶敮锟�
//            //閸欘垯浜掓担璺ㄦ暏Iterator閻ㄥ嫬鐡欓幒銉ュ經ListIterator閺夈儱鐣幋鎰嚡娴狅絼鑵戠�电懓鍘撶槐鐘垫畱閹垮秳缍�
//            if(obj.equals("abc2")){
//                list.add("abc9");
//            }else{
//                System.out.println(obj);
//            }
//        }
//        System.out.println(list);

//        ListIterator it = list.listIterator();
//        while (it.hasNext()){
//            Object obj = it.next();
//            if(obj.equals("abc2")){
//                it.set("abc9");
//            }
//        }
//        System.out.println(list); //[abc1, abc9, abc3]

//        LinkedList link = new LinkedList();
//        link.addFirst("abc1");
//        link.addFirst("abc2");
//        link.addFirst("abc3");

//        System.out.println(link.getFirst()); //abc3
//        System.out.println(link.removeFirst()); //abc3

//        Iterator it = link.iterator();
//        while(it.hasNext()) {
//        	System.out.println(it.next()); //abc3 abc2 abc1
//        }

//        LinkedListSQ sq = new LinkedListSQ();
//        sq.myAdd("abc1");
//        sq.myAdd("abc2");
//        sq.myAdd("abc3");
//        
//        //sq.setType("stack");
//        
//        while(!sq.isNull()) {
//        	System.out.println(sq.myPop()); //abc1 abc2 abc3   abc3 abc2 abc1
//        }

//        ArrayList al = new ArrayList();
//        al.add(new Person("list1",21));
//        al.add(new Person("list2",22));
//        al.add(new Person("list3",23));
//        
//        Iterator it = al.iterator();
//        while(it.hasNext()) {
//        	Person p = (Person)it.next();
//        	System.out.println(p.getName()+"--"+p.getAge());
//        }

		// HashSet鏁版嵁缁撴瀯鏄搱甯岃〃锛屾墍浠ュ瓨鍌ㄥ厓绱犵殑鏃跺�欎娇鐢ㄥ厓绱犵殑hashCode鏂规硶鏉ョ‘瀹氫綅缃紝濡傛灉浣嶇疆鐩稿悓锛屽啀閫氳繃
		// 鍏冪礌鐨別quals鏉ョ‘瀹氬唴瀹规槸鍚︾浉鍚�
//        HashSet hs = new HashSet();
//        hs.add(new Person("list1",21));
//        hs.add(new Person("list2",22));
//        hs.add(new Person("list3",23));
//        hs.add(new Person("list4",24));
//        hs.add(new Person("list1",21));
//        
//        Iterator it = hs.iterator();
//        while(it.hasNext()) {
//        	Person p = (Person)it.next();
//        	System.out.println(p.getName()+"--"+p.getAge());
//        }

//    	ArrayList al = new ArrayList();
//    	al.add(new Person("list1",21));
//    	al.add(new Person("list2",22));
//    	al.add(new Person("list3",23));
//    	al.add(new Person("list4",24));
//    	al.add(new Person("list1",21));
//    	System.out.println(al);
//    	al = getSingleArrayList(al);
//    	System.out.println(al);

		// 以年龄排序

//    	TreeSet ts = new TreeSet(new ComparatorByName());
//    	ts.add(new Person("zhangsan",28));
//    	ts.add(new Person("zhangsan1",26));
//    	ts.add(new Person("zhangsan2",22));
//    	ts.add(new Person("zhangsan3",35));
//    	ts.add(new Person("zhangsan3",28));
//    	
//
//    	Iterator it = ts.iterator();
//    	while(it.hasNext()) {
//    		Person p = (Person)it.next();
//        	System.out.println(p.getName()+"--"+p.getAge());
//    	}
		// zhangsan2--22
		// zhangsan1--26
		// zhangsan--28
		// zhangsan3--28
		// zhangsan3--35

//    	TreeSet ts = new TreeSet(new ComparatorByLength());
//    	ts.add("asfsa");
//    	ts.add("asfsasadfadsgf");
//    	ts.add("asfs14gsdaa");
//    	ts.add("asfsas");
//    	
//    	
//
//    	Iterator it = ts.iterator();
//    	while(it.hasNext()) {
//    		System.out.println(it.next());
//    	}

		// TreeSet<Person> ts = new TreeSet<Person>();
//    	TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
//    	ts.add(new Person("zhangsan",28));
//    	ts.add(new Person("zhangsan1",26));
//    	ts.add(new Person("zhangsan2",22));
//    	ts.add(new Person("zhangsan3",35));
//    	ts.add(new Person("zhangsan3",28));
//    	
//
//    	Iterator<Person> it = ts.iterator();
//    	while(it.hasNext()) {
//    		Person p = it.next();
//        	System.out.println(p.getName()+"--"+p.getAge());
//    	}

//    	Tool<String> tl = new Tool<String>();
//    	tl.show(123);
//    	tl.print("234");
//    	Tool.method(465);

//    	InterImp<String> inter = new InterImp<String>();
//    	inter.show("234");

//    	ArrayList<String> al1 = new ArrayList<String>();
//    	al1.add("al11");
//    	al1.add("al12");
//    	al1.add("al13");
//    	
//    	ArrayList<String> al2 = new ArrayList<String>();
//    	al2.add("al21");
//    	al2.add("al22");
//    	al2.add("al23");
//    	
//    	ArrayList<Integer> al3 = new ArrayList<Integer>();
//    	al3.add(1);
//    	al3.add(2);
//    	al3.add(3);
//    	
//    	printCollection(al1);
//    	printCollection(al2);
//    	printCollection(al3);

//    	ArrayList<Student> als = new ArrayList<Student>();
//    	als.add(new Student("s1",21));
//    	als.add(new Student("s2",22));
//    	als.add(new Student("s3",23));
//    	
//    	ArrayList<Worker> alw = new ArrayList<Worker>();
//    	alw.add(new Worker("w1",24));
//    	alw.add(new Worker("w2",25));
//    	alw.add(new Worker("w3",26));
//    	
//    	printCollection(als);
//    	printCollection(alw);
//    	
//    	ArrayList<Person> alp = new ArrayList<Person>();
//    	alp.add(new Worker("p1",27));
//    	alp.add(new Worker("p2",28));
//    	alp.add(new Worker("p3",29));
//    	printCollectionBySuper(alp);

		/*
		 * Map<Integer,String> map = new HashMap<Integer, String>();
		 * 
		 * //增加修改 System.out.println(map.put(1, "wangcai")); //null
		 * System.out.println(map.put(1, "xiaoqiang")); //wangcai
		 * System.out.println(map); //{1=xiaoqiang}
		 * 
		 * map.put(2, "zhgangshan"); map.put(3, "lisi");
		 * 
		 * //删除 System.out.println("remove:.."+map.remove(2)); //remove:..zhgangshan
		 * System.out.println(map); //{1=xiaoqiang, 3=lisi}
		 * 
		 * //判断 System.out.println("containsKey:.."+map.containsKey(2));
		 * //containsKey:..false
		 * 
		 * //获取 System.out.println(map.get(3)); //lisi
		 */
		/*
		 * Set<Integer> keys = map.keySet(); Iterator<Integer> it = keys.iterator();
		 * while(it.hasNext()) { Integer key = it.next(); String value = map.get(key);
		 * System.out.println(key+":"+value); }
		 */

		/*
		 * Set<Map.Entry<Integer,String>> entry = map.entrySet();
		 * Iterator<Map.Entry<Integer,String>> it = entry.iterator();
		 * while(it.hasNext()) { Map.Entry<Integer,String> me = it.next(); Integer key =
		 * me.getKey(); String value = me.getValue(); System.out.println(key+":"+value);
		 * }
		 */

		/*
		 * Collection<String> values = map.values(); Iterator<String> it =
		 * values.iterator(); while(it.hasNext()) { System.out.println(it.next()); }
		 */

		/*
		 * HashMap<Student,String> hs = new HashMap<Student,String>(); hs.put(new
		 * Student("s1",21), "上海"); hs.put(new Student("s2",22), "北京"); hs.put(new
		 * Student("s3",23), "成都"); hs.put(new Student("s4",24), "广州"); hs.put(new
		 * Student("s1",21), "杭州"); //自动调用Person的equals，hashCode方法
		 * 
		 * Iterator<Student> it = hs.keySet().iterator(); while(it.hasNext()) { Student
		 * key = it.next(); String value = hs.get(key);
		 * System.out.println(key.getName()+":"+key.getAge()+"---"+value); }
		 */

		/*
		 * TreeMap<Student,String> hs = new TreeMap<Student,String>(new
		 * ComparatorByName()); hs.put(new Student("s1",21), "上海"); hs.put(new
		 * Student("s2",26), "北京"); hs.put(new Student("s3",23), "成都"); hs.put(new
		 * Student("s4",24), "广州"); hs.put(new Student("s1",21), "杭州");
		 * //自动调用Person的equals，hashCode方法
		 * 
		 * Iterator<Map.Entry<Student,String>> it = hs.entrySet().iterator();
		 * while(it.hasNext()) { Map.Entry<Student,String> me = it.next(); Student key =
		 * me.getKey(); String value = me.getValue();
		 * System.out.println(key.getName()+":"+key.getAge()+"---"+value); }
		 */

		/*
		 * HashMap<Integer,String> hs = new LinkedHashMap<Integer,String>();
		 * //保证存入和取出顺序一致 hs.put(7, "zhangsan1"); hs.put(8, "zhangsan2"); hs.put(2,
		 * "zhangsan3");
		 * 
		 * Iterator<Map.Entry<Integer,String>> it = hs.entrySet().iterator();
		 * while(it.hasNext()) { Map.Entry<Integer,String> me = it.next(); Integer key =
		 * me.getKey(); String value = me.getValue(); System.out.println(key+":"+value);
		 * }
		 */

		/*
		 * String str = "f+_dgavcbsacADdfs"; char[] chs = str.toCharArray();
		 * 
		 * Map<Character,Integer> map = new TreeMap<>(); for(int i=0;i<chs.length;i++) {
		 * if(chs[i]>='a' && chs[i]<='z' || chs[i]>='A' && chs[i]<='Z') { Integer value
		 * = map.get(chs[i]); if(value==null) { map.put(chs[i], 1); }else {
		 * map.put(chs[i], value+1); } }
		 * 
		 * }
		 * 
		 * StringBuilder sb = new StringBuilder(); Iterator<Character> it =
		 * map.keySet().iterator(); while(it.hasNext()) { Character key = it.next();
		 * Integer value = map.get(key); sb.append(key+"("+value+")"); }
		 * 
		 * System.out.println(sb.toString());
		 */

		/*
		 * List<String> list = new ArrayList<String>(); list.add("sfas");
		 * list.add("agg"); list.add("rth"); list.add("xzbvz"); list.add("agg");
		 * 
		 * Collections.sort(list);
		 * 
		 * System.out.println(list); //[agg, agg, rth, sfas, xzbvz]
		 */

//    	TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
//    	ts.add("abc");
//    	ts.add("bcd");
//    	ts.add("cde");
//    	ts.add("def");
//    	
//    	System.out.println(ts);

//    	int[] iarr = {4,6,8,90,1,2,4};
//    	
//    	System.out.println(myArraysToString(iarr)); //[4,6,8,90,1,2,4]

		/*
		 * int[] iarr = {4,6,8,90,1,2,4}; int[] ibrr = {31,11,51,61}; String[] arr =
		 * {"asdfas","agas","hh","sgas"};
		 * 
		 * List<String> list = Arrays.asList(arr); List arrList = Arrays.asList(iarr);
		 * List<int[]> brrList = Arrays.asList(ibrr);
		 * 
		 * System.out.println(list); System.out.println(arrList);
		 * System.out.println(brrList); //[asdfas, agas, hh, sgas] //[[I@15db9742]
		 */

		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");

//    	String[] arr = list.toArray(new String[list.size()]);
//    	System.out.println(Arrays.toString(arr));  //[abc1, abc2, abc3]

//		for (String string : list) {
//			System.out.println(string);
//		}
//
//		int[] ia = { 1, 2, 3, 4, 5, 6 };
//		for (int i : ia) {
//			System.out.println(i);
//		}
		
		/*
		 * HashMap<Integer,String> hm = new HashMap<Integer,String>(); hm.put(1,
		 * "abc1"); hm.put(2, "abc2"); hm.put(3, "abc3");
		 * 
		 * for(Integer key : hm.keySet()) { String value = hm.get(key);
		 * System.out.println(key+":"+value); } for(Map.Entry<Integer,String> me :
		 * hm.entrySet()) { Integer key = me.getKey(); String value = me.getValue();
		 * System.out.println(key+":"+value); }
		 */
		
		System.out.println(add(1,2,3,4)); //10
		System.out.println(add(1,2,3,4,5,6)); //21
	}
	
	public static int add(int a,int... arr) {
		System.out.println(a);
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}

	public static String myArraysToString(int[] a) {
		int imax = a.length - 1;
		if (imax == -1) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0;; i++) {
			sb.append(a[i]);
			if (i == imax) {
				return sb.append("]").toString();
			}
			sb.append(',');
		}
	}

	private static void printCollection(Collection<? extends Person> al) {
		Iterator<? extends Person> it = al.iterator();
		while (it.hasNext()) {
			Person s = it.next();
			System.out.println(s);
		}
	}

	private static void printCollectionBySuper(Collection<? super Student> al) {
		Iterator<? super Student> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

//	private static ArrayList getSingleArrayList(ArrayList al) {
//		ArrayList temp = new ArrayList();
//		Iterator it = al.iterator();
//		while(it.hasNext()) {
//			Object obj = it.next();
//			//contains和remove都是使用的equals方法来比较筛选，所以可以操作equals来控制
//			//ArrayList不关系到hashCode
//			if(!temp.contains(obj)) {
//				temp.add(obj);
//			}
//		}
//		return temp;
//	}

}
