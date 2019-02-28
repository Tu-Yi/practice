import org.omg.CORBA.PUBLIC_MEMBER;

public class TestObject extends Object {

	int id;
	String name;
	
	public TestObject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestObject other = (TestObject) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestObject object1 = new TestObject(1000,"旺财");
		TestObject object2 = new TestObject(1000, "小强");
		System.out.println(object1==object2);
		System.out.println(object1.equals(object2));
		
		String string = "123";
		System.out.println(string.equals("123"));
		
	}
	
}
