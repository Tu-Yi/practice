/**
 *  打印被5整除的数，每行3个
 * @author yuankun
 * @version 0.1
 */
public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		//while
		while(i<=1000) {
			if(i%5==0) {
				System.out.print(i + "\t");
			}
			if(i%15==0) {
				System.out.println();
			}
			i++;
		}
		System.out.println();
		System.out.println("###############");
		for(int n=1;n<=1000;n++) {
			if(n%5==0) {
				System.out.print(n + "\t");
			}
			if(n%15==0) {
				System.out.println();
			}
		}

	}

}
