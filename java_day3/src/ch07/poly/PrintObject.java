package ch07.poly;

class UserInfo extends Object {
    String name = "홍길동";

    // TODO: UserInfo를 잘 표현하도록 toString을 재정의해보자.
    public String toString() {
    	return "name : " + name; //동적바인딩으로 최적의 내용으로 연결. 최종으로  overriding 
    }
    // END
}

class MemberInfo extends UserInfo {
    String grade = "정회원";

    // TODO: MemberInfo를 잘 표현하도록 toString을 재정의 해보자.
    public String toString() {
    	return super.toString() + ", grade: " + grade;
    }
    // END
}

public class PrintObject {

    public static void main(String[] args) {
        Object member = new MemberInfo();
        System.out.print(member);
    }
}
