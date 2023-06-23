package com.example.demo.car;

public class CarFactory {
	public static Car getCar(String name) {
		if (name.equals("T")) {
			return new Tesla();
		} else {
			return new SuperCar();
		}
	}
}
