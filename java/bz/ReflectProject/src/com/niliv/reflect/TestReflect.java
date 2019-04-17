package com.niliv.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class TestReflect {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		//getClass
		Person person =new Person();
		Class class1 = person.getClass();
		System.out.println(class1);
		
		Person person2 =new Person();
		Class class2 = person2.getClass();
		System.out.println(class1==class2); //true
		//.class
		Class class3 = Person.class;
		System.out.println(class1==class3); //true
		
		//forName 可以放入配置文件
		String className = "com.niliv.reflect.Person";
		Class class4 = Class.forName(className);
		System.out.println(class4==class1); //true
		
		
		//早期 new时候，根据类名称找到字节码文件，加载进内存，并创建该字节码文件对象，并创建字节码文件对象的person对象
		Person person3 = new Person(); //person run
		//现在
		String className1 = "com.niliv.reflect.Person";
		//找到该名称字节码文件，加载进内存，产生Class字节码对象
		Class class5 = Class.forName(className1);
		
		System.out.println(class5.getName()); //com.niliv.reflect.Person
		System.out.println(class5.getSimpleName()); //Person
		System.out.println(class5.getSuperclass()); //class java.lang.Object
		
		
		//创建class对象的person对象,也调用了空参构造函数，如果没有空参构造函数会报错
		Object object = class5.newInstance(); //person run
		
		//没有空参，可以通过指定的构造函数进行初始化 getConstructor
		TestReflectField();
		TestReflectMethod();

	}
	/**
	 * 获取类的属性
	 */
	public static void TestReflectField() throws NoSuchFieldException, SecurityException, NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String className = "com.niliv.reflect.Person";
		Class class1 = Class.forName(className);
		
		//获取指定构造函数
		Constructor constructor = class1.getConstructor(String.class,int.class,String.class,double.class,double.class);
		Object object = constructor.newInstance("xiaoming",12,"cxy",12,12);
		
		Field field = null;
//		field = class1.getField("age"); //获取公共属性
//		System.out.println("field"+field);
		field = class1.getDeclaredField("age"); //只能拿本类，但可以是拿私有
		System.out.println("field"+field); //fieldprivate int com.niliv.reflect.Person.age
//		Field[] fields = class1.getFields(); //所有公有属性
//		System.out.println("field"+fields);
		Field[] fields2 = class1.getDeclaredFields();
		for (Field field2 : fields2) {
			System.out.println(field2);
		}
		
		//强制访问私有变量
		field.setAccessible(true);
		//操作属性的值
		Object obj = class1.newInstance();
		field.set(obj, 89);
		
		System.out.println(field.get(obj)); //89
	}
	/**
	 * 获取方法
	 */
	public static void TestReflectMethod() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String className = "com.niliv.reflect.Person";
		Class class1 = Class.forName(className);
		//遍历本类所有方法
		Method[] methods = class1.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
			System.out.println(method.getReturnType());
			System.out.println(method.getModifiers());  //权限
		}
		//获取方法
		Method method = class1.getMethod("getName",null); //获取公有方法
		Method method1 = class1.getMethod("setName",String.class); //有参
		//操作方法
		Constructor constructor = class1.getConstructor(String.class,int.class,String.class,double.class,double.class);
		Object object = constructor.newInstance("xiaoming",12,"cxy",12,12);
		
		method.invoke(object, null); //xiaoming
		method1.invoke(object, "旺财");
		method.invoke(object, null);  //旺财
		
		
	}
}

