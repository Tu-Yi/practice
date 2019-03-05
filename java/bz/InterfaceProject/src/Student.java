
public class Student extends Person implements Play {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	//实现的是Person的show方法  血缘关系
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	//接口中的cry
	@Override
	public void cry(String name) {
		// TODO Auto-generated method stub
		
	}
	//Person中的cry 必须构成重载，否则报错，无法同时实现
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}
	//覆盖接口默认方法
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("student-method");
	}
	
}
