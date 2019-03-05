package com.niliv.feature;

public interface InterfaceA {
	public void show();
}
interface InterfaceB extends InterfaceA {
	public void show();
}
class MyClass implements InterfaceA,InterfaceB{
	//实现A的show
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}