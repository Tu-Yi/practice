package com.niliv.Circle;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 圆柱体类
 * @author yuankun
 * @version 0.1
 */
public class Cylinder extends Circle {
	
	private double hight;

	public Cylinder(double r, double hight) {
		super(r);
		this.hight = hight;
	}
	//获取体积
	public double getVolume() {
		double area = this.getArea();
		BigDecimal bgPerimeter = new BigDecimal(area * this.hight).setScale(2, RoundingMode.UP);
		return bgPerimeter.doubleValue();
	}
	
}
