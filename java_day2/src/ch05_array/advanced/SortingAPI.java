package ch05_array.advanced;

import java.util.Arrays;
import java.util.Random;

public class SortingAPI {

    public static void main(String[] args) {
        String[] arr = {"Java", "is", "A", "PIE"};
        Arrays.sort(arr);
        System.out.println("정렬 후");
        for (String i : arr) {
            System.out.printf("%s \t", i);
        }
        ints = new int[Short.MAX_VALUE];
        Random rand = new Random();

        for (int i = 0; i < ints.length; i++) {
            ints[i] = rand.nextInt();
        }
        System.out.println();
        long start = System.currentTimeMillis();
         sort1();
        //sort2();
        long end = System.currentTimeMillis();
        System.out.println("소요시간: " + (end - start));
    }

    static int[] ints;

    static void sort1() {
        Arrays.sort(ints);
    }

    static void sort2() {
        // parallel sort가 언제나 빠른건 아니다.
        Arrays.parallelSort(ints);
    }
}
