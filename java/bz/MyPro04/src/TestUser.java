
public class TestUser {

	private String name;
	
	
	
	public TestUser(String name) {
		super();
		this.name = name;
		System.out.println(name);
	}

	public void transfer01(TestUser user) {
		user.name = "transfer01";
	}

	public void transfer02(TestUser user) {
		user = new TestUser("transfer02");
	}

	public static void main(String[] args) {
		
		TestUser user = new TestUser("niliv");
		user.transfer01(user);
		System.out.println(user.name);
		user.transfer02(user);
		System.out.println(user.name);
		
//		niliv
//		transfer01
//		transfer02
//		transfer01

	}

}
