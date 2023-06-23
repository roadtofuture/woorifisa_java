package ch04_control.condition;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        System.out.println("32 ~ 126 사이의 정수를 입력하세요.");
        Scanner scanner = new Scanner(System.in); //사용자로부터 입력을 받겠다 
        int scanned = scanner.nextInt();
        String type = null;
        if (scanned >= 48 && scanned < 58) {
            type = "숫자";
        } else if (scanned >= 65 && scanned < 91) {
            type = "대문자";
        } else if (scanned >= 97 && scanned < 123) {
            type = "소문자";
        } else {
            type = "기타 타입";
        }
        System.out.printf("숫자 %d는 문자로 %c이고 %s입니다.\n", scanned, scanned, type);
        //scanner.close();
    }

    
    //나이 입력
    System.out.println("나이를 입력하세요.")
    int age = scanner.nextInt();
    String ageType = null;
    if (age <8) {
    	ageType = "미취학";
	}else if (age <18) {
		ageType = "청소년";
	}else if (age<50)
    
    	ageType = "청년";
	}else {
		agetype = "장년";
	}
	System.out.println("%d살은 %s이다.\n", age);
	
 

