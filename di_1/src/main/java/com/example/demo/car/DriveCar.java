package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DriveCar {
	// 쓰고 싶다 - has a 관계 -> 멤버 변수로 관리
	//@Autowired -  여기에 작성해도 되나, 지양함 코드를 작성할 수 있는 부분이 없어 디버깅하기 힘듦 
	Car car;

	public DriveCar() {

	}

	@Autowired //- 여기에 쓰는게 제일 권장됨 
	public DriveCar(@Qualifier("tesla") Car car) { // 생성자를 통한 빈 주입 - 필수적인 관계 (대부분 이걸 쓰고 권장)
		this.car = car;
		// this.car = new Ferrari(); //상위에 인터페이스를 사용함으로써 Tesla에서 Ferrari로 바꿔도 괜찮다. 하지만
		// 여전히 바꿔야 하는 단점이 있다. 어떻게 해결? ->parameter로 (Car car) 주면서 바꾸지 않아도 된다.
	} // 이렇게 함으로써 종속성 제거

	public void setCar(Car car) { // setter를 통한 빈 주입 - optional인 관계
		this.car = car;
	}

	public void move(String to) {
		car.drive();
		System.out.println(to + "로 gogogogogo");
	}
}
