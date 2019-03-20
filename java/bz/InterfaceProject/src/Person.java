/**
 * 抽象类
 * @author yuankun
 *
 */
public abstract class Person {
	
	//静态变量name
	public static String name="Person-static-var";
	//静态方法study
	public static void study() {
		System.out.println("Person-static-method");
	}
	//抽象方法
	public abstract void show();
	public abstract void cry();
}
