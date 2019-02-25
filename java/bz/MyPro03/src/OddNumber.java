/**
 *   求奇数，偶数的和
 * @author yuankun
 * @version
 */
public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOdd = 0;
		int sumEven = 0;
		int i=1;
		//while
		while(i<=100) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
			i++;
		}
		System.out.println("##########while########");
		System.out.printf("奇数的和是：%s", sumOdd);
		System.out.println();
		System.out.printf("偶数的和是：%s", sumEven);
		
		sumOdd = 0;
		sumEven = 0;
		//for
		for(int n=1;n<=100;n++) {
			if(n%2==0) {
				sumEven+=n;
			}else {
				sumOdd+=n;
			}
		}
		System.out.println();
		System.out.println("##########for########");
		System.out.printf("奇数的和是：%s", sumOdd);
		System.out.println();
		System.out.printf("偶数的和是：%s", sumEven);
	}
}
