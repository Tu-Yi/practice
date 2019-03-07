import java.util.Arrays;

/**
 *    使用Object数组存储如下表格数据
 * @author yuankun
 * @version 0.1
 *
 */
public class WorkerMain {

	public static void main(String[] args) {
		
		//构造Worker类型数组
		Worker[] workers = new Worker[3];
		workers[0] = new Worker("1002", "高小二", 19, "讲师", 35000, 2000);
		workers[1] = new Worker("1001", "高淇", 18, "程序员", 30000, 5000);
		workers[2] = new Worker("1003", "高小松", 20, "教授", 20000, 3000);
		//排序
		Arrays.sort(workers);
		//打印
		for (Worker worker : workers) {
			System.out.println(worker);
		}
	}
}
class Worker implements Comparable<Worker>{

	private String id;
	private String name;
	private int age;
	private String post;
	private double salary;
	private double subsidy;
	
	
	//重写toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.name+" "+this.age+" "+this.post+" "+this.salary+" "+this.subsidy;
	}

	//compareTo比较工人年龄
	@Override
	public int compareTo(Worker o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
	//构造器
	public Worker() {
		super();
	}

	public Worker(String id, String name, int age, String post, double salary, double subsidy) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.post = post;
		this.salary = salary;
		this.subsidy = subsidy;
	}

	//存取器
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


	public String getPost() {
		return post;
	}


	public void setPost(String post) {
		this.post = post;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double getSubsidy() {
		return subsidy;
	}


	public void setSubsidy(double subsidy) {
		this.subsidy = subsidy;
	}
	
}
