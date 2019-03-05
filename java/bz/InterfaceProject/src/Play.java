
public interface Play {

	String name="Play"; //默认被public static final修饰 必须初始化
	
	public abstract void show();
	public void cry(String name); //可以省略public abstract
	void eat();
	
	//1.8新特性  定义非抽象方法  默认方法可以被子类覆盖
	public default void method() {
		System.out.println("Play-method");
	}
	
	//默认方法
	public default void defaultMethod() {
		System.out.println("Play-default");
	}
	//静态方法
	public static void staticMehtod() {
		System.out.println("Play-static");
	}
}
