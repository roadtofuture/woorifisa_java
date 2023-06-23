package ch03_operator.bit;

public class BitLogical {

    public static void main(String[] args) {
        int i1 = 3;
        System.out.printf("%32s%n", Integer.toBinaryString(i1));
        int i2 = 5;
        System.out.printf("%32s%n", Integer.toBinaryString(i2));

        System.out.printf("%32s%n", Integer.toBinaryString(i1 & i2)); // 1
        System.out.printf("%32s%n", Integer.toBinaryString(i1 | i2)); // 7
        System.out.printf("%32s%n", Integer.toBinaryString(i1 ^ i2)); // 6
        System.out.printf("%32s%n", Integer.toBinaryString(~i1)); // -4
    }

}
