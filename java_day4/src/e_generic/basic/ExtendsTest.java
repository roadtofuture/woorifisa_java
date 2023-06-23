package ch08.e_generic.basic;

// TODO: Number의 하위 타입을 타입 파라미터 T로 받는 NumberBox를 생성하세요.
    //  여러개의 T를 받아서 총 합을 출력하는 addSomes를 작성하세요.

// END

// interface 타입으로 제한할 때도 extends 키워드 사용
class TypeRestrict1<T extends Cloneable> {}

// 여러 interface를 extends 하는 경우 & 연산자로 연결하기
class TypeRestrict2<T extends Number & Cloneable> {}

public class ExtendsTest {

    public static void main(String[] args) {
        // TODO: NumberBox를 사용해보자.

        // END
    }
}
