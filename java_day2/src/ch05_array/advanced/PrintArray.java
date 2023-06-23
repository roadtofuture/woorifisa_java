package ch05_array.advanced;

import java.util.Arrays;

public class PrintArray {

    public static void main(String[] args) {
        String [] strs = {"Hello", "Java", "World"};
        System.out.println(Arrays.toString(strs));

        for(String str: strs){
            System.out.print(str+"\t");
        }
    }
}
