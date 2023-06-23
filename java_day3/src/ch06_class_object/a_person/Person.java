package ch06_class_object.a_person; //주체가 객체한테 행동하도록 시킴

public class Person {
	//속성 - 데이터, 필드, 멤버 변수
	
	String name;
	int age;
	boolean isHungry;
	
	//parameter생성자 - 멤버 변수의 초기화가 목적
	//생성자 오버로딩 
	public Person() {
//		this.name = "익명";
//		this.age = 0;
//		this.isHungry = false;
//      this(): 나의 오버로딩된 다른 생성자 호출 
//		int i = 1; 생성자 호출은 맨 처음 라인에만 가능 
		this("익명", 0, false);
		
		
	} //이름은 같고 파라미터는 다른 형태 
	public Person(String name, int age, boolean isHungry) {
		//this: 객체 자신 - 로컬 변수와 멤버 변수의 이름 충돌 시 
		//멤버를 가리킨다. 
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
	}
	//로컬 변수들이 붉게, 파란글씨는 멤버변수 
	
	
	//기능 - 동작, 메서드, 멤버 메서드 
	void eat() {
		System.out.println("냠냠..");
		this.isHungry = false; //내 객체가 가지고 있는~ 
	}	
	void work() {
		System.out.println("열심히");
		isHungry = true;
	}
	
	void printInfo( ) {
		System.out.println(name+" : "+age+" : "+isHungry);
	}
	
	
	

	
	
	

}
