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
//        System.out.println(c1); //[a1] 删除交集
//        c1.retainAll(c2);
//        System.out.println(c1); //[a2, a3] 取交集
//        System.out.println(c1.containsAll(c2)); //false

//        Iterator it = c1.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next()); //a1 a2 a3
//        }

//        for(Iterator it =c1.iterator(); it.hasNext();){
//            System.out.println(it.next()); //a1 a2 a3
//        }

        List list = new ArrayList();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");

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
//        //list特有取值方式
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            Object obj = it.next();
//            //java.util.ConcurrentModificationException
//            //在迭代过程中不要使用集合操作元素，容易出现异常
//            //可以使用Iterator的子接口ListIterator来完成迭代中对元素的操作
//            if(obj.equals("abc2")){
//                list.add("abc9");
//            }else{
//                System.out.println(obj);
//            }
//        }
//        System.out.println(list);

        ListIterator it = list.listIterator();
        while (it.hasNext()){
            Object obj = it.next();
            if(obj.equals("abc2")){
                it.set("abc9");
            }
        }
        System.out.println(list); //[abc1, abc9, abc3]


    }

}
