public class main {
	public static void main(String[] args) {
			int[] arr = {1,2,3,4,5,6,7};
			User[] userUsers = {
					new User("旺财1", 1),
					new User("旺财2", 2),
					new User("旺财3", 3)
			};
			User[] users =new User[3];
			int[] brr = new int[3];
			System.out.println(brr[0]); //0
			System.out.println(users[0]); //null
	}
}
class User{
	private String nameString;
	private int id;
	public User(String nameString, int id) {
		super();
		this.nameString = nameString;
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}