package ch04_control.self; //중첩반복문 

public class ControlTest03 {
    public static void main(String[] args) {
        // TODO: 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오 .
    	for(int firstDice = 1; firstDice < 7; firstDice++) {
    		for(int secondDice = 1; secondDice < 7; secondDice++) {
    			if (firstDice + secondDice == 6) {
    				System.out.printf("%d, %d\n", firstDice, secondDice);
    			}
    		}
    	}
    }
}
    	


