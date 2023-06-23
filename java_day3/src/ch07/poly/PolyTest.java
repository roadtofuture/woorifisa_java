package ch07.poly;

import ch07.a_extend.spider.Person;
import ch07.a_extend.spider.SpiderMan;

public class PolyTest {
	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan("피터파커");
		Person p = sman; 
		Object obj = sman;
		
		Object [] objs = new Object[3];
		objs[0] = sman;
		objs[1] = "Hello";
		objs[2] = 2; //기본형 아닌가요???? - autoboxing
		//Integer : wrapper class 
		
		for(Object o: objs) {
			System.out.println(o +" :" + o.getClass().getName());
		}
	}

}

