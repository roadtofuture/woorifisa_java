package ch04_control.condition;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이를 입력하세요.");
        int age = scanner.nextInt();

        System.out.println("보호자가 동반하나요?");
        boolean withParent = scanner.nextBoolean();

        if (age >= 12) {
            result = "관람가";
        } else {
            if (withParent) {
                result = "나이는 적지만 보호자가 있어서 관람가";
            } else {
                result = "나이가 적고 보호자도 없어서 관람 불가";
            }
        }
        System.out.printf("나이: %d, 보호자 동반: %b, 결과: %s", age, withParent, result);
        scanner.close();
    }
}
