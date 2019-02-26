/**
 * 打印出实心 10*10 正方形、空心 10*10 正方形,封装成方法
 * @author yuankun
 * @version 0.1
 */
public class PrintSquare {

	public static void main(String[] args) {
		
		printSolidAndHollowSquare(10);
	}

	public static void printSolidAndHollowSquare(int n) {
		// 实心10*10 正方形
		System.out.println("------实心正方形------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		// 空心10*10 正方形
		System.out.println("------空心正方形------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i == 1 || i == n)) {
					System.out.print("* ");
				} else {
					if (j == 1 || j == n) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.print("\n");
		}
	}
}
