
public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Horse horse = new Horse();
//		horse.run();
		
		Zi zi = new Zi();
		zi.show();
	}

}


class Fu{
	public Fu() {
		// TODO Auto-generated constructor stub
		super();
		show();
		return;
	}
	void show() {
		System.out.println("fu show");
	}
}
class Zi extends Fu{
	int num=5;
	public Zi() {
		// TODO Auto-generated constructor stub
		super();
		return;
	}
	void show() {
		System.out.println("zi show"+num);
	}
}



class Vehicle{
	public void run(){
		System.out.println("跑");
	}
	public void stop() {
		System.out.println("停");
	}
	public Person test() {
		return new Person();
	}
}
class Horse extends Vehicle{
	public void run() {
		System.out.println("马儿跑");
	}
	public Student test() {
		return new Student("马儿", 12, "赤兔");
	}
}
