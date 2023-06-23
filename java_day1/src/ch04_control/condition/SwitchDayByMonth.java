package ch04_control.condition;

import java.util.Scanner;

public class SwitchDayByMonth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //키보드에서 값 입력받을거야 
		System.out.println("월을 입력해주세요");
		int month = scanner.nextInt();
		int days = 0;
		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
		}
		System.out.printf("%d월은 %d일까지 있다요", month, days);
		
	
	            
		}
	}

