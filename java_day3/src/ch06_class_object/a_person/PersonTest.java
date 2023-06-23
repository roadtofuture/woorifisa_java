package ch06_class_object.a_person;

public class PersonTest {
	public static void main(String[] args) {
		//클래스를 구체화(객체화) 시켜보자
		int a = 10;
		Person p1 = new Person(); //메모리에 객체 생성 - 주소로 참조 
		p1.name = "홍길동 ";
		p1.age = 10;
		p1.eat();
		p1.printInfo();
		//System.out.println(p1.name+" : "+p1.age+" : "+p1.isHungry);
		
		
		Person p2 = new Person(); //파라미터 생성자가 생기면서 오류가 됨. -> 메서드 오버로딩으로 해결 
		p2.name = "임꺽정";
		p2.work();
		p2.printInfo();
		}

		Person p3 = new Person("장길산", 10, false);
		
		
}
