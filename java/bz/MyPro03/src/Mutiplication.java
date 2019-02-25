/**
 * 乘法表的实现
 * @author yuankun
 * @version 0.1
 */
public class Mutiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal(9);
	}
	
	/**
	 * 打印乘法表
	 * @param n 'nn乘法表'
	 */
	static void cal(int n) {
		//外层循环代表行 i的值代表每行列数
		for(int i=1;i<=n;i++) {
			//内层循环代表列
			for(int j=1;j<=i;j++) {
				System.out.print(i + "*" +j + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}

}
