package ch04_control.condition;

public class SwitchTest2 {

    public static void main(String[] args) {
        SwitchTest2 stest = new SwitchTest2();
        stest.case3(Level.Manager);
    }

    private void case3(Level level) {
        String levelString = "";
        switch (level) {
        case Manager:
            levelString += "운영자관리";
            // break;
        case Operator:
            levelString += "회원관리";
            // break;
        case Member:
            levelString += "글쓰기";
            // break;
        default:
            levelString += "보기";
        }
        System.out.println("당신의 권한은 : " + levelString);
    }
}
