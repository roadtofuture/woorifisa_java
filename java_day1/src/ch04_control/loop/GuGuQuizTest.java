package ch04_control.loop;

import java.util.Random;
import java.util.Scanner;

public class GuGuQuizTest {

    public static void main(String[] args) {
        System.out.println("구구단 문제를 맞추세요. 그만하려면 0 입력");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num1 = random.nextInt(9) + 1;
            int num2 = random.nextInt(9) + 1;

            System.out.printf("%d * %d = %n", num1, num2);

            int result = scanner.nextInt();
            if (result == 0) {
                break;
            } else {
                if (result == num1 * num2) {
                    System.out.println("정답입니다.");
                } else {
                    System.out.println("정답은 " + (num1 * num2) + "입니다.");
                }
            }
        }
        scanner.close();
    }

}
