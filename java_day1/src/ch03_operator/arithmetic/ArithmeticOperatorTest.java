package ch03_operator.arithmetic;

public class ArithmeticOperatorTest {

    public static void main(String[] args) {
        // 나누기와 나머지 연산의 차이
        System.out.println(10 / 3); // 3
        System.out.println(10 % 3); // 1

        byte b1 = 10;
        byte b2 = 20;
        // TODO: 다음 연산의 오류를 확인하고 수정하시오.
        byte b3 = (byte)(b1 + b1);

        // END

        int i1 = 100;
        long l1 = 200;
        // TODO: 다음 연산의 오류를 확인하고 수정하시오.
        int i2 = (int)(i1 + l1);

        // END

        // TODO: 다음의 출력 결과를 예측하고 이유를 설명하시오.
        System.out.println(10 / 3);
        System.out.println(10 / 3.0);
    }
}
