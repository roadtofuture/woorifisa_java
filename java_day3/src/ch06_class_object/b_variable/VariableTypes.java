package ch06_class_object.b_variable;

public class VariableTypes {
    int instanceVariable; // 인스턴스 멤버 변수
    static int classVariable; // 클래스 멤버 변수

    public static void main(String[] args) {// 파라미터 변수

        int localVariable = 10; // 로컬 변수
        for (int i = 0; i < 100; i++) { // 로컬 변수
            System.out.println(i);
        }

    }

}
