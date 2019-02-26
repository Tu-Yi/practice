/**
 * 	求∑1+∑2+∑3+……+∑100
 * 	使用循环和递归实现
 * @author yuankun
 * @version 0.1
 *
 */
public class Lambda {

	public static void main(String[] args) {

		long sum=0;
		for(int x=1;x<=100;x++) {
			//使用循环实现
			for(int y=1;y<=x;y++) {
				sum+=y;
			}
			//使用递归实现
//			sum+=cal(x);
		}
		System.out.println("∑1+∑2+∑3+……+∑100="+sum);
	}
	/**
	 *    递归
	 * @param n
	 * @return
	 */
	public static long cal(int n) {
		if(n==1) {
			return 1;
		}else {
			return n + cal(n-1);
		}
		
	}
}
