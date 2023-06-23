package ch05_array.multi;

public class VariableLengthArrayTest {

    public static void main(String[] args) {
        int[][] arr2 = new int[4][];
        arr2[0] = new int[] { 1, 2, 4, 5 };
        arr2[1] = new int[] { 10, 20, 30, 40, 50 };
        arr2[2] = new int[] { 20, 20, 20 };
        arr2[3] = new int[] { 30, 30, 30, 30, 30 };

        int sum = 0;
        int count = 0;
        // TODO: 배열의 총 합과 평균을 출력하시오.
        for(int [] row: arr2) {
        	count += row.length;
        	for(int num: row) {
        		sum+=num;
        	}
        }
        // END
        System.out.printf("요소는 총 %d개이고 총 합은 %d, 평균은 %5.1f이다.", count, sum, 1.0*sum/count);
    }
}
