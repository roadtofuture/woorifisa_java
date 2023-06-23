package ch03_operator.compare;

public class CompareOperator {

    public static void main(String[] args) {
        System.out.println('A' > 'B'); // 65 > 66
        // 비교 연산에서의 형 변환
        System.out.println('A' == 65); // int 이하의 연산 - 일단 int로 변경:65 == 100
        System.out.println(3 == 3.0); // 두 피 연산자 중 큰 타입으로 형 변환: 3.0 ==3.0

        // 주의 사항: 0.1의 표현 문제
        System.out.println(0.1 + " : " + 0.1f + " : " + (0.1 == 0.1f));
        System.out.println(0.5 + " : " + 0.5f + " : " + (0.5 == 0.5f));

        double d1 = 0.1;
        float f1 = 0.1f;
        System.out.println((int) (d1 * 10) == (int) (f1 * 10));
        System.out.println((float) d1 == f1);

        // 문자열에서의 == 과 equals
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        // TODO: s1과 s2가 같은 내용인지와 같은 객체인지를 출력하시오.
		

        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf(1);
        System.out.println((i1 == i2) + " : " + i1.equals(i2));

        Integer i3 = Integer.valueOf(128);
        Integer i4 = Integer.valueOf(128);
        // TODO: i3과 i4가 같은 내용인지와 같은 객체인지를 출력하시오.
		

    }

}
