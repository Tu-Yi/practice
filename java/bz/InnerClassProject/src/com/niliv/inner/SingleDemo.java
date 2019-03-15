package com.niliv.inner;

public class SingleDemo {
	public static void main(String[] args) {
		Single ssSingle1 = Single.getInstance();
		Single ssSingle2 = Single.getInstance();
		System.out.println(ssSingle1==ssSingle2);  //true
	}
}
//饿汉
class Single{
	
	static Single single = new Single();
	private Single() {}
	public static Single getInstance() {
		return single;
	}
}
//懒汉
class SingleLazy{
	static SingleLazy single_lazy = null;
	private SingleLazy() {}
	public static SingleLazy getInstance() {
		if(single_lazy==null)
			single_lazy = new SingleLazy();
		return single_lazy;
	}
}