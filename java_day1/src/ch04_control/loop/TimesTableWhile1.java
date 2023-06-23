package ch04_control.loop;

import java.util.Scanner;

public class TimesTableWhile1 {
    public static void main(String[] args) {
        System.out.println("출력할 단을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        int i = 1;
        while (i <= 9) {
            System.out.print(dan + "*" +i+ "=" + (dan * i)+"\t");
            i++;
        }
        System.out.println();
    }
}
