import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestStoreData {
	
	public static void main(String[] args) {
		
		User user1 = new User("1001", "旺财", 12, 20000);
		User user2 = new User("1002", "小强", 13, 30000);
		
		Map<String,User> map = new HashMap<String, User>();
		map.put(user1.getId(), user1);
		map.put(user2.getId(), user2);
		
		Set<Map.Entry<String,User>> entry = map.entrySet();
		Iterator<Map.Entry<String,User>> it = entry.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String,User> mEntry = it.next();
			String idString = mEntry.getKey();
			User user = (User)mEntry.getValue();
			System.out.println(idString + ": " + user);
		}
	}
}

class User {
	
	private String id;
	private String name;
	private int age;
	private double salary;
	
	public User() {
		super();
	}

	public User(String id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return this.name + " " + this.age + " " + this.salary;
	}
}