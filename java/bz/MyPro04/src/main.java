
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SxtStu stu = new SxtStu();
		stu.age=12;
		stu.name="zhangshang";
		stu.id=1;
		Computer computer = new Computer();
		computer.brand = "thinkpad";
		stu.computer = computer;
		stu.study();
	}

}


