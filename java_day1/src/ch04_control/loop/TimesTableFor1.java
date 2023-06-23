package ch04_control.loop;

import java.util.Scanner;

public class TimesTableFor1 {
     
    public static void main(String[] args) {
        System.out.println("출력할 단을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();
        
        for(int i=1; i<=9; i++){
            System.out.print(dan+"*"+i+"="+(dan * i)+"\t");
        } 
    } 
}

