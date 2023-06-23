package ch09_exception.b_throws;

public class CheckedThrowsTest {
    public static void main(String[] args) { //마지막까지 던져버리면 뻑나게 됨 최소한 한군데서는 try-catch를
        CheckedThrowsTest et = new CheckedThrowsTest();     
        try {
			et.method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
        System.out.println("프로그램 종료");
    }

    public void method1() throws ClassNotFoundException {
        method2(); //자동완성으로 try-catch가능
    }

    public void method2() throws ClassNotFoundException {
        Class.forName("Some Class");
    }
}

