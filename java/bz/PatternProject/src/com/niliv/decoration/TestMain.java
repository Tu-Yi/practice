package com.niliv.decoration;

public class TestMain {
	public static void main(String[] args) {
		Car car = new Car(new FlyCar(new AiCar()));
		car.move();
		
	}
}
