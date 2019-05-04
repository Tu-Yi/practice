
public class TestLambda {
	public static void main(String[] args) {
		//匿名内部类
//		new Thread(new Runnable() {
//			public void run() {
//				for(int i=0;i<20;i++) {
//					try {
//						Thread.sleep(200);
//					} catch (InterruptedException e) {
//						
//						e.printStackTrace();
//					}
//					System.out.println("一起听歌");
//				}
//			}
//		}).start();
//		//lambda表达式
//		new Thread(()-> {
//			for(int i=0;i<20;i++) {
//				System.out.println("一起唱歌");
//			}
//		}).start();
		
		MyInterface inter = (a,b)->{
			System.out.println("我是lambda："+(a+b));
		};
		inter.study(1, 2); //我是lambda：3
		
		MyInterface inter1 = new student();
		inter1.study(1, 2); //我是student：3
	}
}

interface MyInterface {
	void study(int a, int b);
}
class student implements MyInterface {

	@Override
	public void study(int a, int b) {
		System.out.println("我是student："+(a+b));
	}
	
}
