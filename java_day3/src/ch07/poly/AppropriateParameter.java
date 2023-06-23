package ch07.poly;

import ch07.a_extend.spider.Person;
import ch07.a_extend.spider.Spider;

public class AppropriateParameter {

    public void useJump1(Object obj) {
        if (obj instanceof Person) {
            Person casted = (Person) obj;
            casted.jump();
        }
    }

    public void useJump2(Person person) {
        person.jump();
    }

    public void useJump3(Spider.SpiderMan spiderMan) {
        spiderMan.jump();
    }

    public static void main(String[] args) {
        Object obj = new Object();
        Person person = new Person();
        Spider.SpiderMan sman = new Spider.SpiderMan();

        AppropriateParameter ap = new AppropriateParameter();
        ap.useJump1(obj);    // 호출은 가능하지만 실제로 jump할 수는 없다.
        ap.useJump1(person);
        ap.useJump1(sman);

        // ap.useJump2(obj);
        ap.useJump2(person);
        ap.useJump2(sman);

        // ap.useJump3(obj);
        // ap.useJump3(person);
        ap.useJump3(sman);
    }
}
