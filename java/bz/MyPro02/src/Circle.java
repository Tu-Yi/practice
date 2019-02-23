import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *    通过过半径初始化圆
 * @author yuankun
 * @version0.1
 */
public class Circle {

	private double r;
	final float PI = 3.14f;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public double getRound() {
		BigDecimal bgPerimeter = new BigDecimal(2 * PI * r).setScale(2, RoundingMode.UP);
		return bgPerimeter.doubleValue();
	}
	
	public double getArea() {
		BigDecimal bgArea = new BigDecimal(PI * r * r).setScale(2, RoundingMode.UP);
		return bgArea.doubleValue();
	}
}
