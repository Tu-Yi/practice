
public class TestInterface {

	public static void main(String[] args) {
		
		//接口实例化
		Play play = new Student();
		System.out.println(play.name); //静态变量可以用实例调用
		play.method(); //非抽象方法
		//为什么接口的静态法只能用类名调用？
		Play.mehtod1();
		
		//抽象类实例化
		//为什么抽象类的静态方法和属性，用实例都可以调用？
		Person person = new Student();
		person.study();
		System.out.println(person.name);
	}

}
