package ch13_collection.b_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    // TODO: Object 타입의 데이터를 중복 없이 관리하기 위한 자료구조를 선언해보자.
	Set<Object> set = new HashSet<>();
    // END
	

    private void addMethod() {
        // TODO: set에 자료를 추가하기 위한 코드를 작성해보자.
    	set.add("hello");
    	set.add("hello");
    	set.add(2);
    	set.add(5);
    	Phone p1 = new Phone("010", 100);
    	Phone p2 = new Phone("010", 100);
    	System.out.println((p1==p2)+" " +p1.equals(p2));
    	set.add(p1);
    	set.add(p2);
    	System.out.println(set); //중복 안되고 입력의 순서와 무관 
        // END
    	System.out.println("----------------------");
    }

    private void retrieveMethod() {
        // TODO: set에서 다양한 방식으로 자료를 검색해보자.
    	System.out.println(set.contains("Hello"));
    	System.out.println(set.isEmpty());
    	System.out.println(set.size());
    	for(Object obj:set) {
    		System.out.println(obj);
    	}
    	
        // END
    	System.out.println("----------------------");
    }

    //set은 인덱스가 없으므로 update가 없음 
    private void removeMethod() {
    	
        // TODO: set에서 자료를 삭제해보자.
    	System.out.println("삭제 전 : " +set);
    	set.remove("hello");
    	System.out.println("삭제 후 : " +set);
        // END
    	System.out.println("----------------------");
    }


	

    public static void main(String[] args) {
        HashSetTest hst = new HashSetTest();
        hst.addMethod();
        hst.retrieveMethod();
        hst.removeMethod();
    }
}
