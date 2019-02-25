import java.util.Iterator;
import java.util.Random;

public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * double r = Math.random(); int i = (int) (6 * r) + 1; System.out.println(i);
		 * if (i <= 3) { System.out.println("小"); } else { System.out.println("大"); }
		 * 
		 * //Random不好取范围 for (int x = 0; x < 10; x++) { Random random = new Random();
		 * Thread.sleep(100); System.out.print(random.nextInt(100) + " "); }
		 */
		
		/*
		 * double r = 4*Math.random(); double area = Math.PI * Math.pow(r, 2); double
		 * round = Math.PI * 2 * r; System.out.println(area); System.out.println(round);
		 */
		
		/*
		 * Random rdRandom = new Random(); int r = rdRandom.nextInt(100);
		 * System.out.println(r); if(r>=85) { System.out.println("A"); }else if(r>=70 &&
		 * r<85) { System.out.println("B"); }else if (r>=60 && r<70) {
		 * System.out.println("C"); }else { System.out.println("D"); }
		 */
		
		
//		char c = 'a';
//		int r = (int) (26 * Math.random());
//		System.out.println(r);
//		int ss = c + r;
//		System.out.println(ss);
//		char c2 = (char) (c + r);
//		System.out.println(c2);
//		switch (c2) {
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			System.out.println("元音");
//			break;
//		default:
//			System.out.println("辅音");
//			break;
//		}
		 
		
		
		/*
		 * int i = 1; int sum = 0; // while (i<=100) { // sum+=i; // i++; // } //
		 * System.out.println(sum);
		 * 
		 * // do { // sum+=i; // i++; // } while (i<=100);
		 * 
		 * for (; i <= 100; i++) { sum += i; } System.out.println(sum);
		 */
		
		
		
		/*
		 * for(int i=1;i<=5;i++) { for(int j=1;j<=5;j++){ System.out.print(i+" "); }
		 * System.out.println(); }
		 */
		  
		
//		for (int i = 1; i <= 9; i++) {
//			test:
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
//			}
//			System.out.println();
//			if(i==8) {
//				break test;
//			}
//		}
		 
		
		//打印能被5整除的数，每五个换行
		int j = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 5 == 0) {
				System.out.print(i);
				j++;
			}
			if (j % 5 == 0) {
				System.out.println();
				j = 0;
			}
		}
		 
		
//		for(int i=0;i<3;i++){
//			for(int j=0;j<3;j++){
//				if(i==1 && j==0)
//					break;  // i=1的时候跳出内层循环
//				System.out.println(i+""+j);
//			}
//		}
//		for(int i=0;i<3;i++){
//			for(int j=0;j<3;j++){
//				if(i==1 && j==0)
//					continue;  // i=1的时候跳出内层循环
//				System.out.println(i+""+j);
//			}
//		}
//		test:
//		for(int i=0;i<3;i++){
//			for(int j=0;j<3;j++){
//				if(i==1 && j==0)
//					break test;  // i=1的时候跳出内层循环
//				System.out.println(i+""+j);
//			}
//		}
//		//打印质数
//		outer:
//		for(int i=101;i<150;i++) {
//			for(int j=2;j<i/2;j++) {
//				if(i%j==0) {
//					continue outer;
//				}
//			}
//			System.out.println(i);
//		}
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
