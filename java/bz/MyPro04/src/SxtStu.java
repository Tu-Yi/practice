
public class SxtStu {
	int id;
	String name;
	int age;
	Computer computer;
	void study() {
		System.out.println("正在学习" + computer.brand);
	}
	void play() {
		System.out.println("王者农药");
	}
}
class Computer{
	String brand;
}
