package com.niliv.decoration;

public class SuperCar implements ICarable {

	private ICarable car;
	
	public SuperCar(ICarable car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}

}
