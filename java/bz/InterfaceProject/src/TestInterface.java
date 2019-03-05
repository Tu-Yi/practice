
public class TestInterface {

	public static void main(String[] args) {
		
		//接口实例化
		Play play = new Student();
		play.method();  //student-method
		System.out.println(play.name); //静态变量可以用实例调用  Play
		//为什么默认方法只能通过对象调用？
		//为什么接口的静态方法只能用类名调用？
		play.defaultMethod(); //Play-default
		Play.staticMehtod(); //Play-static
		
		//抽象类实例化
		//为什么抽象类的静态方法和属性，用实例都可以调用？
		Person person = new Student();
		person.study(); //abstract-static
		Person.study();
		System.out.println(person.name); //Person
		
	}

}
