package com.niliv.inner;

public class SonInstance {
	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.show();
	}
}
class Fu{
	Fu() {
		super();
		show();
		return;
	}
	void show() {
		System.out.println("fu show....");
	}
}
class Zi extends Fu{
	int num = 8;
	Zi() {
		super();
		return;
	}
	void show() {
		System.out.println("zi show...."+num);
	}
}