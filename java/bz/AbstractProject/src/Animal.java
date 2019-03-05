
public abstract class Animal {
	
	int num=10;
	
	public void eat() {
		System.out.println("动物吃饭");
	}
	
	public abstract void cry();

}

class Cat extends Animal{

	int Number = 11;
	int age=1;
	
	public void eat() {
		System.out.println("小喵吃鱼");
	}
	
	public void catcheMouse() {
		System.out.println("小喵抓老鼠");
	}
	
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("喵喵喵");
	}
	
}

class Dog extends Animal{

	int Number = 12;
	int age=2;
	
	public void eat() {
		System.out.println("狗吃骨头");
	}
	
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("汪汪汪");
	}
	
}
