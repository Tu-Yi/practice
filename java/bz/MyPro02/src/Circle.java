import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *    通过过半径初始化圆
 * @author yuankun
 * @version0.1
 */
public class Circle {

	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public double getRound() {
		BigDecimal bgPerimeter = new BigDecimal(2 * Math.PI * r).setScale(2, RoundingMode.UP);
		return bgPerimeter.doubleValue();
	}
	
	public double getArea() {
		BigDecimal bgArea = new BigDecimal(Math.PI * Math.pow(r, 2)).setScale(2, RoundingMode.UP);
		return bgArea.doubleValue();
	}
}
