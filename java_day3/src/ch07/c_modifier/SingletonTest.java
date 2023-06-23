package ch07.c_modifier;

//기능(메서드만 존재), 상태(멤버 변수가 없다!) - stateless한 클래스 
class SingletonClass {
	private static SingletonClass sc = new SingletonClass();
	
//	public void setSc(SingletonClass sc) { //어차피 외부에서는 만들지 못하기 때문에 setter는 의미가 없다
//		this.sc = sc;
//	}
	
	public static SingletonClass getSc() {
		return sc; //메모리에 올라가게 됨
	}
		// TODO Auto-generated method stub

	
    // TODO:SingletonClass에 singleton design pattern을 적용하시오.
	private SingletonClass() { //객체가 private이므로 부를 수가 없으니 getter를 쓸수가없음. 
		
	}
    // END

    public void sayHello() {
        System.out.println("Hello");
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        // TODO: SingletonClass 객체를 사용해보자.
    	//SingletonClass sc = new SingletonClass();
    	SingletonClass sc = SingletonClass.getSc();
    	sc.sayHello();
    	
    	//SingletonClass sc2 = new SingletonClass();
    	SingletonClass sc2 = SingletonClass.getSc();
    	sc2.sayHello();
    	
    	System.out.println(sc==sc2);

        // END
    }
}
//어플리케이션을 만들게 되는 경우 대부분 싱클턴 형식으로 만들게 될 것+ 

//왜 싱글턴인가 이유를 알아야 함 
