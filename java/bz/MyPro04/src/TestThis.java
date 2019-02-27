
public class TestThis {
	
	private String name;
	private int age;
	
	public TestThis() {
		this.name = "niliv";
		this.age = 35;
		System.out.println("我是无参构造函数 " + this.name + " " + this.age);
	}
	public TestThis(String name) {
		//this();
		this.name = name;
		System.out.println("我是name构造函数 " + this.name + " " + this.age);
	}
	public TestThis(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("我是全参构造函数 " + this.name + " " + this.age);
	}
	public void speak() {
		System.out.println("当前对象：" + this + " name:"+this.name+ " age:"+this.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThis tt1 = new TestThis("旺财");
		tt1.speak();
		TestThis tt2 = new TestThis("小强",1200);
		tt2.speak();
		
//		我是无参构造函数 niliv 35
//		我是name构造函数 旺财 35
//		当前对象：TestThis@15db9742 name:旺财 age:35
//		我是全参构造函数 小强 1200
//		当前对象：TestThis@6d06d69c name:小强 age:1200
	}

}
