package ch04_control.condition;

public class SwitchSimple {

    public static void main(String[] args) {
        int level = 0;
        String levelString = "";
        switch (level) {
        // 0은 관리자이다 
        case 0:
            levelString = "운영자관리, 회원관리, 글쓰기, 보기";
            break;
        case 1:
            levelString = "회원관리, 글쓰기, 보기";
            break;
        case 2:
            levelString = "글쓰기, 보기";
            break;
        default:
            levelString = "보기";
        }
        System.out.println("당신의 권한은 : " + levelString);
    }
}
