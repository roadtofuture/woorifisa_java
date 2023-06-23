
package ch07.ty.phone;

public class HandPhone extends Phone {
    String mode;
    String comm;
    String lastCall;
    String[] shortNum = new String[10];

    public HandPhone(String num, String mode, String comm, String lastCall, String[] shortNum) {
        super(num);
        this.mode = mode;
        this.comm = comm;
        this.lastCall = lastCall;
        this.shortNum = shortNum;
    }

    // method overriding
    @Override
    void call(String num) {
        super.call(num);
        lastCall = num;
    }

    // method overloading
    void call() {
        if (lastCall != null) {
            call(lastCall);
        }
    }

    // method overloading
    void call(int id) {
        if (shortNum[id] != null) {
            call(shortNum[id]);
        } else {
            System.out.println("아직 미등록이에요..");
        }
    }
}
