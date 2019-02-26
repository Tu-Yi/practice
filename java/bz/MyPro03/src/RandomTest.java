
/**
 *    生成 0-100 随机数，直到生成 88 为止，停止循环！
 * @author Administrator
 *
 */
public class RandomTest {

	public static void main(String[] args) {
		double r; 
		int i; 
		int t=0;
		System.out.println("开始");
		while(true) {
			t++;
			r = Math.random();
			i = (int) (100 * r);
			if(i==88) {
				break;
			}
		}
		System.out.println("结束");
		System.out.println("循环"+t+"次");
	}

}
