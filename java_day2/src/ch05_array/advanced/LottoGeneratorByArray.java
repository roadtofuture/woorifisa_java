package ch05_array.advanced;

import java.util.Arrays;
import java.util.Random;

public class LottoGeneratorByArray {

    public static void main(String[] args) {
        int[] selected = new int[6];
        int[] fullBall = new int[46];

        int cnt = 0;
        Random rand = new Random();
        while (cnt < 6) {
            int num = rand.nextInt(45);
            int ball = fullBall[num];
            if (ball == 0) {
                selected[cnt] = num + 1;
                fullBall[num] = -1;
                cnt++;
            }
        }
        Arrays.sort(selected);
        System.out.println(Arrays.toString(selected));
    }
}
