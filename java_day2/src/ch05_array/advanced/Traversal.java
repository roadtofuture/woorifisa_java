package ch05_array.advanced;

import java.util.Arrays;

public class Traversal {
    static int N = 5;
    static int[][] nums = new int[N][N];

    static void fill() {
        // TODO: nums 배열에 1~25까지 채우고 출력하시오.

        // END
    }

    static void columnFirstTraversal() {
        // TODO: nums를 column 우선으로 탐색하고 출력하시오.

        // END
    }

    static void zigzagTraversal() {
        // TODO: nums를 zigzag로 탐색하고 출력하시오. 짝수 행은 오른쪽, 홀수 행은 왼쪽으로 

        // END
    }

    static void getSum() {
        // TODO: 배열에서 6의 배수를 찾아서 그 요소부터 오른쪽 끝까지 요소의 합과 아래로 끝까지의 요소의 합을 출력하시오.

        // END
    }

    static void getHorSideSum() {
        // TODO: N*N의 배열을 만들고 nums의 각 요소의 좌우에 있는 요소들의 합을 저장하고 출력하시오.

        // END
    }

    static void getCrossSum() {
        // TODO: N*N의 배열을 만들고 nums의 각 요소의 상,하,좌,우 4방에 있는 요소들의 합을 저장하고 출력하시오.

        // END
    }

    static void getAroundSum() {
        // TODO: N*N의 배열을 만들고 nums의 각 요소의 주변 8방에 있는 요소들의 합을 저장하고 출력하시오.

        // END
    }

    // TODO: 주어진 좌표가 범위 안에 있는지를 반환하시오.

    // END

    // TODO: deltas 배열을 이용하여 nums를 달팽이 탐색으로 출력해보자.

    // END

    public static void main(String[] args) {
        fill();
        System.out.println();
        // columnFirstTraversal();
        // zigzagTraversal();
        //getSum();
        // getHorSideSum();
        // getCrossSum();
        //getAroundSum();
        snailTraversial();
        snailTraversial2();
        snailTraversial3();
    }

}
