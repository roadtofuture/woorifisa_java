package com.example.demo.car;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//메타 정보를 작성할 설정 파일
@Configuration
@ComponentScan(basePackages = {"com.example.demo.car"}) //어디를 찾아볼지 지정해주면 component들을 찾아서 스캔해서 만들어줌 

public class CarConfig {
	// bean 구성 : 비즈니스 로직을 가진 객체
//	@Bean
//	public Tesla tesla() {
//		return new Tesla(); 
//		
//	}
//	@Bean
//	public Ferrari ferrari() {
//		return new Ferrari();
//	}
//	
//	@Bean
//	public DriveCar driveCar() {
//		//return new DriveCar(tesla()); //의존성을 주입 , 괄호 안에 다른 차로 바뀌더라도 비즈니스 로직은 변하지 않는다 
//		DriveCar dc = new DriveCar();
//		dc.setCar(ferrari());
//		
//		return dc;
//	}
}