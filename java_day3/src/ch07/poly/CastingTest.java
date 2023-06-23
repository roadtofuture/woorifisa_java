package ch07.poly;

import ch07.a_extend.spider.Person;
import ch07.a_extend.spider.SpiderMan;

public class CastingTest {
    public void primitive() {
        byte b = 10;
        // 묵시적 형변환: 작은 집 --> 큰집
        int i = b;
        // 명시적 형변환: 큰집 --> 작은 집
        byte b2 = (byte) i;
    }

    public void reference() {
        // 묵시적 형변환: 작은 집 --> 큰집
    	SpiderMan sman = new SpiderMan("핕터파커");
    	Person person = sman; 
    	
        // p.fireWeb(); -- 메모리에 있지만 사용할 수 없다.
        // 명시적 형변환: 큰집 --> 작은 집
    	SpiderMan reSman =  (SpiderMan)person;
    	reSman.jump();
    	reSman.fireWeb(); //error: is not visible (접근제한)-->spiderman 가서 public써줌
    	
        // 이제는 SpiderMan 타입이므로 fireWeb을 사용할 수 있다.
    }
}
