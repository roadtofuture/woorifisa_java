package ch07.poly;

import java.io.Serializable;

public class InstanceOfTest2 {
    static interface MyInterface {}

    static class SuperClass {}

    static class SubClass extends SuperClass {}

    static class Some {}

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // String은 Number의 하위 타입이 아니므로 오류
        //boolean b1 = "Hello" instanceof Number;
        // SubClass는 Some 타입이 아니므로 오류
        //boolean b2 = new SubClass() instanceof Some;
        boolean b3 = new SubClass() instanceof SuperClass;

        boolean b4 = new SubClass() instanceof MyInterface;
        boolean b5 = new Some() instanceof MyInterface;       // 컴파일 타임에 Some과 interfcce관계는 알 수 없다.

        // final 클래스는 interface도 불가
        //boolean b6 = "Hello" instanceof MyInterface;
        // 기본으로 implements 된 interface는 사용 가능
        boolean b7 = "Hello" instanceof Serializable;
    }

}
