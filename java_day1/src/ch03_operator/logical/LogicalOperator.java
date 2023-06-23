package ch03_operator.logical;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;

        System.out.printf("b1 & b2 : %b%n", b1 & b2); // false
        System.out.printf("b1 | b2 : %b%n", b1 | b2); // true
        System.out.printf("b1 ^ b2 : %b%n", b1 ^ b2); // true
        System.out.printf("b2 ^ b3 : %b%n", b2 ^ b3); // false
        System.out.printf("!b1 : %b%n", !b1); // false

    }
}
