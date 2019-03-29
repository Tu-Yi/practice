package com.niliv.decoration;

public class FlyCar extends SuperCar{

	public FlyCar(ICarable car) {
		super(car);
		
	}

	@Override
	public void move() {
		super.move();
		System.out.println(this+" 我能在天上飞");
	}

	@Override
	public String toString() {
		return "FlyCar";
	}
	
}
