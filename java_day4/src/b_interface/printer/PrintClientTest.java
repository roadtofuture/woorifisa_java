package ch08.b_interface.printer;

interface Printer {
    void print(String fileName);

    public int a = 3;
    int b = 5;

   // TODO: 모든 프린터가 색을 칠할 수 있도록 fillColor()를 추가해보자.

    // END
}

class LaserPrinter implements Printer {
    @Override
    public void print(String fileName) {
        System.out.printf("Laser Printer로 출력 중: %s%n", fileName);
    }
}

class DotPrinter implements Printer {
    @Override
    public void print(String fileName) {
        System.out.printf("Dot Printer로 출력 중: %s%n", fileName);
    }
}

class PrintClient {
    private Printer printer;

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printThis(String fileName) {
        this.printer.print(fileName);
    }
}

public class PrintClientTest {

    public static void main(String[] args) {
        PrintClient pc = new PrintClient();
        pc.setPrinter(new DotPrinter());        // DotPrinter 사용
        pc.printThis("Hello.java");
        pc.setPrinter(new LaserPrinter());        // LaserPrinter 사용
        pc.printThis("Hi.java");
    }
}
