package com.example.demo.car;

public class DriveCarTest {
	
	public static void main(String[] args) {
		DriveCar dc = new DriveCar(CarFactory.getCar("T"));
		dc.move("상암동");
	}

}
