package com.company;

public class Main {


	public static void main(String[] args) {

Human jeff = new Human("jeff",120); //实例化对象并初始化值
System.out.println(jeff.getName()); //jeff 获取name
System.out.println(jeff.getWeight());//120 获取weight
jeff.setName("David");//设置name
Human david = jeff;//对象地址传递

david.workout();
System.out.println(jeff.getWeight());//115
System.out.println(david.getWeight());//115

System.out.println(Human.getNumber());//0
System.out.println(Human.getNumber());//0

Human kitty = Human.newHuman("kitty",120);
System.out.println(kitty.getName());//kitty



































//		Puppy py = new Puppy("xiaoming");
//	    py.setAge(2);
//	    py.getAge();
//	    System.out.println(py.pupyAge);
//
//	    Employee emp = new Employee("yuankun");
//
//	    emp.setSalary(12345.5);
//	    emp.printEmployee();
//
//
//	    double a = 3.1415926;
//	    float  c = 3.1415926f;
//	    double aa = (double)c;
//		int aaa = 1;
//		byte bbb = (byte)aaa;
//		short jjj = 123;
//		aaa = jjj;
//		char ee = '1';
//
//		String cc = String.valueOf(aaa);
//		String ss = String.valueOf(ee);
//		String hh = String.valueOf(a);
//
//
//	    System.out.println(cc);
//
//	    System.out.println(aaa++);
//		System.out.println(++aaa);
//		int y = 1;
//		boolean yu = (y<4) || (y>0);
//		System.out.println(yu);
//
//		if(y>1){
//			System.out.println(1);
//		}
//		else if(y<1){
//			System.out.println(2);
//		}
//		else{
//			System.out.println(3);
//		}
//
//		int[] intList = {1,2,3,4,5,6};
//		System.out.println(String.valueOf(intList));
//
//
//		Human def = new Human();
//		System.out.println(def.getName());
//		System.out.println(def.getWeight());
//
//		Human jeff = new Human("jeff",120);
//		System.out.println(jeff.getName());
//		System.out.println(jeff.getWeight());
//		jeff.setName("David");
//		Human david = jeff;
//
//		int newweight = david.workout();
//		System.out.println(jeff.getWeight());
//		System.out.println(david.getWeight());
//
//		System.out.println(Human.getNumber());
//		System.out.println(Human.getNumber());
//
//		Human kitty = Human.newHuman("kitty",120);
//
//		System.out.println("i am split");
//		for (int i=1;i<10;i=i*2){
//			System.out.println(i);
//		}

    }
}
