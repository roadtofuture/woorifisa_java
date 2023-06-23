package ch07.poly;

import ch07.a_extend.spider.Person;
import ch07.a_extend.spider.Spider;

public class PolymorphismTest {

    public static void main(String[] args) {
        Spider.SpiderMan sman = new Spider.SpiderMan();
        Person person = sman;
        Object obj = sman;

        System.out.printf("sman==person? %b%n", sman == person);
        System.out.printf("sman==obj? %b%n", sman == obj);
    }
}
