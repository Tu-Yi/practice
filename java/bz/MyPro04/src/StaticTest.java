
public class StaticTest {

	
	private String name;
	private int age;
	static {
		System.out.println("first");
	}
	public StaticTest() {
		// TODO Auto-generated constructor stub
		System.out.println("second");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest test = new StaticTest();
	}

}
