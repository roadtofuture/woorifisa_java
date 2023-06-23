package ch06_class_object.d_constructor;

public class ThisPerson {
    String name;
    int age;
    boolean isHungry;

    ThisPerson(String name, int age, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }

    String getPersonInfo() {
        return String.format("name: %s, age: %d, isHungry: %b", this.name, this.age, isHungry);
    }

    public static void main(String[] args) {
        ThisPerson person = new ThisPerson("홍길동", 20, true);
        System.out.println(person.getPersonInfo());
    }
}
