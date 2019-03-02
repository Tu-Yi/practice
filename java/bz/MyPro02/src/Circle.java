import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * 设计一个类代表二维空间的一个圆
 * @author yuankun
 * @version 0.1
 */
public class Circle {

	private double r;
	private Point point;
	
	public Circle(double r, Point point) {
		super();
		this.r = r;
		this.point = point;
	}

	//获取周长
	public double getRound() {
		BigDecimal bgPerimeter = new BigDecimal(2 * Math.PI * r).setScale(2, RoundingMode.UP);
		return bgPerimeter.doubleValue();
	}
	//获取面积
	public double getArea() {
		//保留小数点后两位小数并四舍五入
		BigDecimal bgArea = new BigDecimal(Math.PI * Math.pow(r, 2)).setScale(2, RoundingMode.UP);
		return bgArea.doubleValue();
	}
}

/**
 * 圆心
 * @author yuankun
 *
 */
class Point{
	private double x,y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
}
