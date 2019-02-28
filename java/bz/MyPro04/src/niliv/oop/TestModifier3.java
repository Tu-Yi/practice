package niliv.oop;

import niliv.haha.TestModifier1;

public class TestModifier3 extends TestModifier1 {

	public TestModifier3(String name, String sex, String age, String major) {
		super(name, sex, age, major);
		// TODO Auto-generated constructor stub
	}
	
	void say() {
		//System.out.println(name); //The field TestModifier1.name is not visible
		//System.out.println(sex); //The field TestModifier1.sex is not visible
		System.out.println(age);
		System.out.println(major);
	}

}
