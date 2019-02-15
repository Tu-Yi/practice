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
//        System.out.println(c1); //[a1] 鍒犻櫎浜ら泦
//        c1.retainAll(c2);
//        System.out.println(c1); //[a2, a3] 鍙栦氦闆�
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
//        //list鐗规湁鍙栧�兼柟寮�
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            Object obj = it.next();
//            //java.util.ConcurrentModificationException
//            //鍦ㄨ凯浠ｈ繃绋嬩腑涓嶈浣跨敤闆嗗悎鎿嶄綔鍏冪礌锛屽鏄撳嚭鐜板紓甯�
//            //鍙互浣跨敤Iterator鐨勫瓙鎺ュ彛ListIterator鏉ュ畬鎴愯凯浠ｄ腑瀵瑰厓绱犵殑鎿嶄綔
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
        
    	//HashSet数据结构是哈希表，所以存储元素的时候使用元素的hashCode方法来确定位置，如果位置相同，再通过
    	//元素的equals来确定内容是否相同
        HashSet hs = new HashSet();
        hs.add(new Person("list1",21));
        hs.add(new Person("list2",22));
        hs.add(new Person("list3",23));
        hs.add(new Person("list4",24));
        hs.add(new Person("list1",21));
        
        Iterator it = hs.iterator();
        while(it.hasNext()) {
        	Person p = (Person)it.next();
        	System.out.println(p.getName()+"--"+p.getAge());
        }
        
    }

}
