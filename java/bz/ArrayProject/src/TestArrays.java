import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6};
		int [] brr = {1,2,3,4,5,6};
		
		// Arrays.toString 返回内容的字符串形式
		System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5, 6]
		// Arrays.equals 相同的顺序包含相同的元素
		System.out.println(Arrays.equals(arr, brr)); //true
		System.out.println(arr.equals(brr)); //false  数组没有重写equals 用的是Object的equals
		// Arrays.copyOf 复制，和新数组长度没关系，新数组长度取决于函数的长度参数，浪费内存，用System.arrayCopy实现，存
		int [] crr = new int[2];
		crr = Arrays.copyOf(arr, 10); //效率低
		System.out.println(Arrays.toString(crr)); //[1, 2, 3, 4, 5, 6, 0, 0, 0, 0]
		//Arrays.fill 循环填充
		Arrays.fill(crr, 99);
		System.out.println(Arrays.toString(crr));//[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]
		//Arrays.sort 升序
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//比较自定义类型，必须实现Comparable接口
		Person[] persons = new Person[3];
		persons[0] = new Person("小明", 19, "男");
		persons[1] = new Person("旺财", 16, "男");
		persons[2] = new Person("小强", 25, "男");
		
		Arrays.sort(persons);
		
		for (Person person : persons) {
			System.out.println(person);
		}
		
	}
}
class Person implements Comparable<Person>{
	
	private String nameString;
	private int age;
	private String sex;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Person(String nameString, int age, String sex) {
		super();
		this.nameString = nameString;
		this.age = age;
		this.sex = sex;
	}
	public Person() {
		super();
	}
	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
	@Override
	public String toString() {
		
		return (this.nameString + "\t" + this.age);
	}
	
}
