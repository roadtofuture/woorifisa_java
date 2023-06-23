package ch03_operator.bit;

public class ShiftOperation {

    public static void main(String[] args) {
        int a = 0b1000;
        to32BitStr(a);
        to32BitStr(a << 2);
        to32BitStr(a >> 2);
        to32BitStr(a >>> 2);

        a = -100;
        to32BitStr(a);
        to32BitStr(a << 2);
        to32BitStr(a >> 2);
        to32BitStr(a >>> 2);

    }

    private static void to32BitStr(int a) {
        String str = String.format("%32s", Integer.toBinaryString(a)).replaceAll(" ", "0");
        System.out.printf("bit 표현: %s, 숫자: %d%n", str, a);

    }
}
