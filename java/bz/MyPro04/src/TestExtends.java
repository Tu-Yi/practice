import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestExtends {

	public TestExtends() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Student student = new Student("旺财", 12, "警犬");
		student.study();
		student.rest();
		System.out.println(student instanceof Person);
		System.out.println(student instanceof Student);
		System.out.println(student instanceof Object);
		System.out.println(new Person() instanceof Object);
	}

}

class Person{
	String name;
	int age;
	
	public void rest() {
		System.out.println("人类需要休息");
	}
}
class Student extends Person{
	String major;

	public Student(String name,int age,String major) {
		this.name = name;
		this.age =age;
		this.major = major;
	}
	
	public void study() {
		System.out.println("学生需要学习");
	}
	
}
