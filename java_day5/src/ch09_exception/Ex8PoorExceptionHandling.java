package ch09_exception;

/**
 * @since 2021. 7. 8.
 */
public class Ex8PoorExceptionHandling {
    public void method(String[] args, String name, int divisor) {
        try {
            System.out.println(args[0]);

            System.out.println(name.length());

            System.out.println(1 / divisor);
        } catch (Exception e) {
            // 쉿!!!
        }
    }

    public void method2(String[] args, String name, int divisor) {
        if (args != null && args.length > 1) {
            System.out.println(args[0]);
        }
        if (name != null) {
            System.out.println(name.length());
        }
        if (divisor != 0) {
            System.out.println(1 / divisor);
        }
    }
}
