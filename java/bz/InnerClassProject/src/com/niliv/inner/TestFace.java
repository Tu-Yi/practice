package com.niliv.inner;

import com.niliv.inner.Face.Nose;

public class TestFace {
	public static void main(String[] args) {
		Face face = new Face();
		face.show();
		Nose nose = face.new Nose();
		nose.breath();
		
//		Outer.Inner  inner = new Outer.Inner();
//		inner.show();
//		
//		Outer.Inner2.show();
//		MyClass myClass = new MyClass();
//		myClass.show();
	}
}
