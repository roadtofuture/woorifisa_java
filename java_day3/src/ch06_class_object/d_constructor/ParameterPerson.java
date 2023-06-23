package ch06_class_object.d_constructor;

public class ParameterPerson {
    String name;
    int age;
    boolean isHungry;

    // 생성자의 역할 : member 변수의 초기화..
    ParameterPerson(String n, int a, boolean i) {
        name = n;
        age = a;
        isHungry = i;
    }

    public static void main(String[] args) {
        ParameterPerson person = new ParameterPerson("홍길동", 10, true);
        //ParameterPerson p2 = new ParameterPerson();
    }
}
