import sun.java2d.pipe.LoopBasedPipe;

public class OopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long d1 = System.currentTimeMillis();
		System.out.printf("%d阶乘的结果:%s%n",20,factorial(25));
		long d2 = System.currentTimeMillis();
		System.out.printf("递归耗时：%s%n",d2-d1);
		
		long d3 = System.currentTimeMillis();
		System.out.printf("%d阶乘的结果:%s%n",20,loop(25));
		long d4 = System.currentTimeMillis();
		System.out.printf("循环耗时：%s%n",d4-d3);
		
//		20阶乘的结果:2432902008176640000
//		递归耗时：28
//		20阶乘的结果:2432902008176640000
//		循环耗时：1

	}
	/*
	 * public static int add(int a,int b,int c) { return (a+b+c); } public static
	 * double add(double a,int b,int c) { return (a+b+c); } public static double
	 * add(int a,double b,int c) { return (a+b+c); }
	 */
	
	static long factorial(long n) {
		if(n==1) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}
	
	static long loop(long a) {
		long result = 1;
        while (a > 1) {
            result *= a * (a - 1);
            a -= 2;
        }
        return result;
	}

}
