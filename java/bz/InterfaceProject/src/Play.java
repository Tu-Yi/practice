/**
 * 接口
 * @author yuankun
 *
 */
public interface Play {

	//静态变量name
	String name="Play-static-var"; //默认被public static final修饰 必须初始化
	//抽象方法
	public abstract void show();
	public void cry(String name); //可以省略public abstract
	void eat();
	
	//默认方法
	public default void defaultMethod() {
		System.out.println("Play-default-method");
	}
	//静态方法
	public static void staticMehtod() {
		System.out.println("Play-static-method");
	}
}
