
public interface Play {

	String name="Play"; //默认被public static final修饰 必须初始化
	
	public abstract void show();
	public void cry(String name); //可以省略public abstract
	void eat();
	
	//1.8新特性  定义非抽象方法 
	public default void method() {
		System.out.println("interface-method");
	}
	//静态方法
	public static void mehtod1() {
		System.out.println("interface-static");
	}
}
