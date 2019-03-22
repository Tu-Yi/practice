package com.niliv.list;


public class TestGeneric {
	public static void main(String[] args) {
		
		InterImp<String> imp = new InterImp<String>();  //实例化的时候传入类型
		Son<String> son = new Son<String>();  //实例化的时候传入类型
		
		son.show("123");  //和实例化传入的类型一样
		son.method(123); //自定义类型方法
		son.method("123");
		son.aMethod(456);
		son.aMethod("123","456","789");  //自定义可变参数类型方法
	}
}
class Fu<T>{
	
}
interface Inter<T>{
	
}
//class Son extends Fu<String>{
//	
//}  定义的时候传入类型
//class InterImp implements Inter<String>{
//	
//}  定义的时候传入类型
class InterImp<Q> implements Inter<Q> {
}
class Son<T> extends Fu<T>{
	
	public void show(T t) {
		System.out.println(t);
	}
	
	public <Q> void method(Q q) {
		System.out.println(q);
	}
	
	public <K> void aMethod(K...k) {
		System.out.println(k);
	}
}