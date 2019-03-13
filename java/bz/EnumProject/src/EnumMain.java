
public class EnumMain {
	public static void main(String[] args) {
		
		Gender sex = Gender.女;
		sex.setName("张静");
		System.out.println(sex.getName());
		
		Person person = new Person("旺财", 12, Gender.女);
		System.out.println(person.getGender());
	}
}
