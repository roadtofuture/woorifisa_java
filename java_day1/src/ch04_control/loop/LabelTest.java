package ch04_control.loop;

public class LabelTest {

    public static void main(String[] args) {
        outer: for (int i = 1; i < 10; i++) {
            inner: for (int j = 1; j < 10; j++) {
                if (j == 5) {
                    break; // 각 단별로 *4까지만 출력
                    // break inner; // break와 동일
                    // break outer; // 1 * 4까지만 출력
                    // continue; // *5는 생략하고 출력
                    // continue inner; // continue와 동일
                    // continue outer; // *5 부터 빠지고 단 구분이 없음
                }
                System.out.printf("%d*%d=%d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}
