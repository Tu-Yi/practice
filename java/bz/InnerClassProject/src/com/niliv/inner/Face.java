package com.niliv.inner;


public class Face {
	private String shapString="瓜子脸";
	public void show() {
		System.out.println(new Nose().shapString);
	}
	//外部类成员无法访问内部类成员
	class Nose{
		private String shapString = "高鼻梁";
		public void breath() {
			System.out.println(Face.this.shapString); //内部类访问外部类成员
			System.out.println(this.shapString);
		}
	}

}
