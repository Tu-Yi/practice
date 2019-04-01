package com.niliv.thread;

public class SingleDemo {
//	Single ssSingle1 = Single.getInstance();
//	Single ssSingle2 = Single.getInstance();
//	System.out.println(ssSingle1==ssSingle2);  //true
}
//饿汉 不存在同步问题
class Single{
	
	static Single single = new Single();
	private Single() {}
	public static Single getInstance() {
		return single;
	}
}
//懒汉 外层加null判断是为了提高效率，下个线程进来不用判断锁
class SingleLazy{
	static SingleLazy single_lazy = null;
	private SingleLazy() {}
	public static SingleLazy getInstance() {
		if(single_lazy==null) {
			synchronized (SingleLazy.class) {
				if(single_lazy==null)
					single_lazy = new SingleLazy();
			}
		}
		return single_lazy;
	}
}