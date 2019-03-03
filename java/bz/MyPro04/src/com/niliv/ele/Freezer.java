package com.niliv.ele;

public class Freezer {
	private String brand;

	public Freezer(String brand) {
		super();
		this.brand = brand;
		System.out.println("有一个"+this.brand+"冰箱");
	}
	
	public void OpenDoor() {
		System.out.println("打开冰箱门");
	}
	public void CloseDoor() {
		System.out.println("关闭冰箱门");
	}
	public void Putin(Animal am) {
		System.out.println("将"+am.getName()+"放进冰箱");
	}
}
