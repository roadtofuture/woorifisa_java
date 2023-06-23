package ch03_operator.logical;

public class ShortCircuit {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println((a += 10) > 15 | (b -= 10) > 15);
        // TODO: a와 b의 값을 예상하고 출력하시오.
		System.out.println(a);
		System.out.println(b);

        a = 10;
        b = 20;
        System.out.println((a += 10) > 15 || (b -= 10) > 15);
        // TODO: a와 b의 값을 예상하고 출력하시오.
        System.out.println(a);
		System.out.println(b);
    }
}


