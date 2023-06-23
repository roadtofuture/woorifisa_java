package b_interface;

public interface MyInterface {
	
	//멤버변수
	public static final int a;
	int b; //당연한거라 생략하고 쓰기 가능
	
	//멤버메서드
	public abstract void method1();
	void method2(); //생략가능 ,  다 abstract니까 interface앞에 안써도 됨 
	

}
