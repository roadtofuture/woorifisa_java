package ch09_exception.b_throws;

public class RuntimeThrowsTest {
    public static void main(String[] args) {
        RuntimeThrowsTest et = new RuntimeThrowsTest();
        try {
            et.method1();
        } catch (ArithmeticException e) {
            System.out.printf("예외 처리: %s%n", e.getMessage());
        }
        System.out.println("프로그램 종료");
    }

    public void method1() throws ArithmeticException {
        method2();
    }

    public void method2() throws ArithmeticException { //예외 여러개 나오면 그 중 제일 첫번째가 디버깅 해야 할것!!!! 
        int i = 1 / 0;
    } 	
}


