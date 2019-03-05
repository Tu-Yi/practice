package com.niliv.inner;

public abstract class AnonyClass {
	abstract void show();
}

class Son extends AnonyClass{

	@Override
	void show() {
		System.out.println("son");
	}
}

class AnonyClass_Son{
	
	public static void main(String[] args) {
		
		AnonyClass anonyClass1 = new Son();
		anonyClass1.show();
		
		AnonyClass anonyClass = new AnonyClass() {
			
			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("AnonyClass_Son");
			}
		};
		
		anonyClass.show();
	}
	
}
