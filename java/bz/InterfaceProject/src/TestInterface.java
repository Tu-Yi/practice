
public class TestInterface {

	public static void main(String[] args) {
		
		//接口实例化
		Play play = new Student();
		System.out.println(Play.name); //接口类可以访问接口的静态变量
		System.out.println(play.name); //接口的实例可以访问接口的静态变量
		//为什么接口的默认方法只能通过对象调用？
		//为什么接口的静态方法只能用类名调用？
		play.defaultMethod(); //Play-default-method
		Play.staticMehtod(); //Play-static-method
		
		
		//抽象类实例化
		//为什么抽象类的静态方法和属性，用实例都可以调用？
		Person person = new Student();
		person.study(); //Person-static-method
		Person.study(); //Person-static-method
		System.out.println(person.name); //Person-static-var
		System.out.println(Person.name); //Person-static-var
		
	}
@
