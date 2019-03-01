
/**
 * 测试圆类
 * @author yuankun
 * @version 0.1
 */
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point = new Point(100, 100);
		Circle circle = new Circle(5,point);
		System.out.println("该圆的面积为："+circle.getArea());
	}

}
