package ch06_class_object.f_javadoc;

/**
 * 이 클래스는 자바의 도큐멘테이션 주석을 테스트하기 위한 클래스이다.
 * 
 * @author itsme
 *
 */
public class JavaDocTest {
    /**
     * 멤버 변수에 대한 주석
     */
    public int memberVar;

    /**
     * 기본 생성자이다.
     */
    public JavaDocTest() {
        System.out.println("기본 생성자");
    }

    /**
     * 멤버 메서드에 대한 주석
     * 
     * @param num
     *            memberVar에 곱해지는 수
     * @return num과 memberVar의 곲을 리턴한다.
     */
    public int multiPlyMemberVar(int num) {
        return memberVar * num;
    }
}
