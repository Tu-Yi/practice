package com.niliv.decoration;

public class Car extends SuperCar {

	public Car(ICarable car) {
		super(car);
	}

	@Override
	public void move() {
		super.move();
		System.out.println(this+" 我能在地上跑");
	}

	@Override
	public String toString() {
		return "Car";
	}
	
	
}
