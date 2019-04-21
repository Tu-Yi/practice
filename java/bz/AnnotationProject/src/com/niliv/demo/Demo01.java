package com.niliv.demo;

import java.util.ArrayList;
import java.util.List;

//压制提示
@SuppressWarnings("all")
public class Demo01 {
	
	//重写注解 如果方法名不对会报酬
	@Override
	public String toString() {
		return "";
	}
	//不建议使用 会出现横线，但仍可以执行
	@Deprecated
	public static void test001() {
		System.out.println("test001");
	}
	@MyAnnotation_1(name="yuankun",age=35,schools= {"石油大学","清华大学"})
	public static void test002() {
		List list = new ArrayList();
		List list2 = new ArrayList();
	}
	@MyAnnotation_2("aaa")
	public static void test003() {
		return;
	}
}
