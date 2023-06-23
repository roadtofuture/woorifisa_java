package ch03_operator.arithmetic;

public class OverFlowAndCasting {

    public static void main(String[] args) {

        int i1 = Integer.MAX_VALUE;
        int i2 = i1 + 1;
        // TODO: i2의 값을 예상하고 출력하시오. // -2147483648  // 정수의 문제 : 오버플로우 , 최대값 넘으면 제일 최솟값이 되는 것 
		

        long l1 = i1 + 1;
        // TODO: l1의 값을 예상하고 출력하시오. // -2147483648
        System.out.println(l1);

        long l2 = (long) (i1 + 1);
        // TODO: l2의 값을 예상하고 출력하시오.
        System.out.println(l2);

        long l3 = (long) i1 + 1;
        // TODO: l3의 값을 예상하고 출력하시오. // 2147483648
        System.out.println(l3);

        int i3 = 1000000 * 1000000 / 100000; 
        int i4 = 1000000 / 100000 * 100000; 
        // TODO: i3와 i4의 값을 예상하고 출력하시오.
        System.out.println(i3);  //-7273
        System.out.println(i4);  // 1000000
    }
}
