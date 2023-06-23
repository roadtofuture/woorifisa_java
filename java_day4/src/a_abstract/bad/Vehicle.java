package a_abstract.bad;

public abstract class Vehicle {

    private int curX, curY;

    public void reportPosition() {
        System.out.printf("현재 위치: (%d,	%d)%n\",	curX,	curY");
    }

    public abstract void addFuel(); // 구현부가 없을때는 abstract로 
