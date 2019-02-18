package com.niliv.collection;

public class Tool<T> {

	private T t;
	public T getObject() {
		return this.t;
	}
	public void setObject(T t) {
		this.t = t;
	}
	/**
	 * 泛型方法：可以方法上自定义泛型，这样就可以随便传值
	 * @param w
	 */
	public <W> void show(W w) {
		System.out.println("show..."+w);
	}
	public void print(T t) {
		System.out.println("Print..."+t);
	}
	/**
	 * 静态方法：静态方法要使用泛型就要在方法上定义泛型来使用
	 * @param w
	 */
	public static <S> void method(S s) {
		System.out.println("Static..."+s);
	}
}
