package com.niliv.Circle;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 圆类
 * @author yuankun
 * @version 0.1
 */
public class Circle {

	private double r;
	
	public Circle(double r) {
		super();
		this.r = r;
	}
	public Circle() {}

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
