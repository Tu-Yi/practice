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
	 * ���ͷ��������Է������Զ��巺�ͣ������Ϳ�����㴫ֵ
	 * @param w
	 */
	public <W> void show(W w) {
		System.out.println("show..."+w);
	}
	public void print(T t) {
		System.out.println("Print..."+t);
	}
	/**
	 * ��̬��������̬����Ҫʹ�÷��;�Ҫ�ڷ����϶��巺����ʹ��
	 * @param w
	 */
	public static <S> void method(S s) {
		System.out.println("Static..."+s);
	}
}
