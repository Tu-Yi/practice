package niliv.haha;
public class TestModifier1 {
	
	private String name;
	String sex;
	protected String age;
	public String major;
	
	public TestModifier1(String name, String sex, String age, String major) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.major = major;
	}
	
	void speak() {
		System.out.println("TestModifier1");
	}
}

class TestSon extends TestModifier1{
	
	public TestSon(String name, String sex, String age, String major) {
		super(name, sex, age, major);
		// TODO Auto-generated constructor stub
	}

	protected void speak() {
		System.out.println("TestSon");
	}
}

