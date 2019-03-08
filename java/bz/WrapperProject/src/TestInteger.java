
public class TestInteger {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(123);
		Integer i2 = new Integer("123");
		Integer i3 = new Integer(128);
		System.out.println(i1.equals(i2)); //true
		System.out.println(i1); //123   Integer 重写了 toString
		System.out.println(i1.compareTo(i3)); //-1
		System.out.println(i1.compareTo(i2)); //0
		System.out.println(i3.compareTo(i2)); //1
		Integer[] iiIntegers = {i1,i2,i3};
	
		//Integer==>int
		int a = i1.intValue();
		System.out.println(a); //123
		
		//int==>Integer
		Integer a1 = Integer.valueOf(a);
		System.out.println(a1); //123
		
		//String==>int
		int a2 = Integer.parseInt("123");
		System.out.println(a2); //123
		
		//int==>String
		String s1 = a2+"";
		System.out.println(s1); //123
		
		//String==>Integer
		Integer a3 = new Integer("123");
		System.out.println(a3); //123
		
		//Integer==>String
		String s2 = a3.toString();
		System.out.println(s2); //123
	}

}
