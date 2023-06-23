package ch04_control.loop;

public class TimesTableWhile2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9) {
            System.out.print(i + "단: ");
            int j = 1;
            while (j <= 9) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
