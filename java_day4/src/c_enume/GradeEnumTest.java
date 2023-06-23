package c_enume;

import b_interface.cowork.bteam.CalculatorImpl;

enum Grade {
    SALES, PART_TIME_JOB, NORMAL
}

public class GradeEnumTest {
    private static final int SALES = 100;
    private static final int PART_TIME_JOB = 200;
    private static final int NORMAL = 300;

    private static final int SPRING = 300;

    public void calcSalNormal(int grade) {
        if (grade == SALES) {
            System.out.println("영업 실적 반영");
        } else if (grade == PART_TIME_JOB) {
            System.out.println("근무 시간 반영");
        } else if (grade == NORMAL) {
            System.out.println("근로 계약 기준");
        }
    }

    // TODO: calcSalNormal의 문제점을 파악해보고 Enum 형태로 변경해보자.
    public void calcSalEnum(Grade grade) {
    	if(grade.equals(Grade.SALES)) {
    		System.out.println("영업 실적 반영");
    	}else if(grade.equals(Grade.PART_TIME_JOB)) {
    		System.out.println("근무 시간 반영");
    	}else if(grade.equals(Grade.NORMAL)) {
    		System.out.println("근로 계약 기준");
    	}
    }
    // END

    public static void main(String[] args) {
        Grade grade = Grade.SALES;
        System.out.println(grade);
        System.out.println(grade instanceof Enum); // true
        System.out.println(grade instanceof Object); // true
        
        
       GradeEnumTest get = new GradeEnumTest();
       
       get.calcSalNormal(3);
       get.calcSalEnum(Grade.NORMAL);
       //get.calcSalNormal(GradeEnumTest.NORMAL);
       

    }
}
