
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal amC = new Cat();
		Animal amD = new Dog();
		System.out.println(amC.num);
		System.out.println(amD.num);
		amC.eat();
		amC.cry();
		amD.eat();
		amD.cry();
	}

}
