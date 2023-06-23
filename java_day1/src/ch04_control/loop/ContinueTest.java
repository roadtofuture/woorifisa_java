package ch04_control.loop;

public class ContinueTest {
    public static void main(String[] args) {
        System.out.println("1~1000까지의 정수 중 3의 배수의 합은?");
        int sum = 0;
        for (int j = 1; j <= 1000; j++) {
            if (j % 3 > 0) {
                continue;
            }
            sum += j;
        }
        System.out.println("1~1000까지의 정수 중 3의 배수의 합은 " + sum);
    }
}
