
public class TestBox {
	public static void main(String[] args) {
		
		Integer integer = 23; //装箱 编译器自动调用valueOf方法
		int i = new Integer(123); //拆箱 调用了intValue方法
		
		 Boolean i1 = false;
		 Boolean i2 = false;
		 Boolean i3 = true;
		 Boolean i4 = true;
		  
		 System.out.println(i1==i2);//true
		System.out.println(i3==i4);//true
		
		Integer num1 = 100;  
		int num2 = 100;  
		System.out.println(num1.equals(num2));  //true
		
		
	}
}
