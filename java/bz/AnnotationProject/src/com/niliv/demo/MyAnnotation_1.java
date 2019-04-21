package com.niliv.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation_1 {
	String name() default "";
	int age() default 0;
	int id() default -1;
	
	String[] schools() default {"青花大学","北京大学"};
}
