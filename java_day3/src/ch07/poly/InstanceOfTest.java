package ch07.poly;

import ch07.a_extend.spider.Person;
import ch07.a_extend.spider.SpiderMan;
//ctrl+shift+o를 누르면 작성된코드를 기반으로 자동으로 임포트가 불러와짐 

public class InstanceOfTest {
    public void badCasting() {
        Person p = new Person("피터파커");
        SpiderMan sman = (SpiderMan)p;  //컴파일 에러(개발하면서 발생하는 에러) vs 런타임 에러(돌아가면서 발생하는 에러) 
        
        sman.fireWeb();
    }

    public void goodCasting() {
    	Person p  = new Person("피터파커");
    	//메모리에 있는 진짜 타입 확인
    	if(p instanceof SpiderMan) {
    		SpiderMan sman = (SpiderMan)p;
    		sman.fireWeb();
    	}else {
    		System.out.println("스파이더맨 아닌데");
    	}
       
    }

    public static void main(String[] args) {
        InstanceOfTest iot = new InstanceOfTest();
        // 아래 메서드 호출은 runtime 오류를 발생시킨다.
       //iot.badCasting();
        iot.goodCasting();
    }
    
    
}
