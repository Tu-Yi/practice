package com.niliv.demo;

import java.lang.annotation.Annotation;

public class MyORM {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class clazz = Class.forName("com.niliv.demo.Student");
		
		//获取的类的所有注解
		Annotation[] annotations = clazz.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation); //@com.niliv.demo.Table(value=tb_student)
		}
		//获取类的注解值
		Table table = (Table)clazz.getAnnotation(Table.class); 
		System.out.println(table.value()); //tb_student
		
		java.lang.reflect.Field field =  clazz.getDeclaredField("sname");
		Field field2 = field.getAnnotation(Field.class);
		System.out.println(field2.columnName() +"--"+field2.type()+"--"+field2.length());
		
		System.out.println("tableName: " + table.value());
		System.out.println("field："+field2.columnName() +"--"+field2.type()+"--"+field2.length());
		
	}
}
