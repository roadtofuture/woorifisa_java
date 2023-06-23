package ch04_control.loop;

public class BreakTest {

    public static void main(String[] args) {
        System.out.println("제곱수가 1000보다 작은 가장 큰 정수는?");
        int i = 0;
        while (true) {
            if (Math.pow(i, 2) > 1000) {
                break;
            }
            i++;
        }
        System.out.println("제곱 수가 1000보다 작은 가장 큰 정수는 " + (--i));
    }
}
