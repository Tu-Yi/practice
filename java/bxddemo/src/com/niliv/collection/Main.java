package com.niliv.collection;

import java.util.*;

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
        
    	//HashSet鏁版嵁缁撴瀯鏄搱甯岃〃锛屾墍浠ュ瓨鍌ㄥ厓绱犵殑鏃跺�欎娇鐢ㄥ厓绱犵殑hashCode鏂规硶鏉ョ‘瀹氫綅缃紝濡傛灉浣嶇疆鐩稿悓锛屽啀閫氳繃
    	//鍏冪礌鐨別quals鏉ョ‘瀹氬唴瀹规槸鍚︾浉鍚�
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
    	
    	
    	//以年龄排序
    	
    	TreeSet ts = new TreeSet();
    	ts.add(new Person("zhangsan",28));
    	ts.add(new Person("zhangsan1",26));
    	ts.add(new Person("zhangsan2",22));
    	ts.add(new Person("zhangsan3",35));
    	ts.add(new Person("zhangsan3",28));
    	

    	Iterator it = ts.iterator();
    	while(it.hasNext()) {
    		Person p = (Person)it.next();
        	System.out.println(p.getName()+"--"+p.getAge());
    	}
    	//zhangsan2--22
    	//zhangsan1--26
    	//zhangsan--28
    	//zhangsan3--28
    	//zhangsan3--35
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








