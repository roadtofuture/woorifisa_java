package ch09_exception.a_trycatch;

public class InstallTool {
    void copy() {
        System.out.println("파일 복사");
    }

    void install() throws Exception {
        System.out.println("설치");
        if (Math.random() > 0.5) {
            throw new Exception("설치 과정에서 문제 발생");
        }
    }

    void delete() {
        System.out.println("파일 삭제");
    }
}
