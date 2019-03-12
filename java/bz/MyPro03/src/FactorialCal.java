/**
 * 1!+2!+3!+4!+5!
 * @author yuankun
 * @version 0.1
 */
public class FactorialCal {

	public static void main(String[] args) {

		int sum=0;
		//递归实现
//		for(int i=1;i<=5;i++) {
//			sum+=factorial(i);
//		}
		//循环实现
		for(int i=1;i<=5;i++) {
			int t=0;
			for(int j=1;j<=i;j++) {
				t*=j;
			}
			sum+=t;
		}
		System.out.println("1!+2!+3!+4!+5!的结果为："+sum);
	}
	/**
	 * 递归求n的阶乘
	 * @param n
	 * @return
	 */
	static int factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return n * factorial(n-1);
		}
	}
}
