import java.util.Scanner;

/**
 * 输入4个数字，每位乘以5再%10，然后1和4位对调，2和3位对调
 * @author yuankun
 *
 */

public class DecodeByFourNum {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = 0;
		//偷下懒，未作其他判断，默认使用者知道是数字
		do {
			System.out.print("请输入一个4位正整数：");
			num = s.nextInt();
		} while (num < 1000 || num > 9999);

		
		int temp;
		int a[] = new int[4];
		a[0] = num / 1000; // 取千位的数字
		a[1] = (num/100)%10; //取百位的数字
		a[2] = (num/10)%10; //取十位的数字
		a[3] = num%10;   // //取个位的数字
		//运算
		for(int j=0;j<4;j++){
			a[j]+=5;
			a[j]%=10;
		}
		//1和4位交换 2和3位交换
		for(int j=0;j<=1;j++){
			temp =a[j];
			a[j] = a[3-j];
			a[3-j] =temp;
		}
		System.out.print("加密后的数字为：");
		for(int j=0;j<4;j++) {
			System.out.print(a[j]);
		}
	}
}
