package ch13_collection.a_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
    // TODO: Object를 저장할 수 있는 List를 만들어보자.
	List<Object> list = new LinkedList<>();
	
    // END

    public void createTest() {
        // TODO: list에 다양한 데이터를 추가하고 출력해보자.
    	list.add("Hello"); //append
    	list.add("Java"); //append
    	list.add(0, 1); //insert
    	list.add(1); // append
    	System.out.println(list);
        // END
    }

    public void retrieveTest() {
        // TODO: list의 내용을 다양한 방법으로 조회해보자.
    	
    	System.out.println(list.contains("Java"));
    	List<Object> temp = List.of(1, "Hello", "Java", 1);
    	System.out.println("모두 같니?" +list.equals(temp)+", 같은 객체니?" +(list == temp));
    	System.out.println(" 1번째 요소는? "+list.get(1));
    	System.out.println(list.indexOf("Java"));
    	System.out.println(list.indexOf("Python"));
    	System.out.println(list.size());
    	System.out.println(Arrays.toString(list.toArray()));
    	for(Object o :list) {
    		System.out.println(o);
    	}
    	
        // END
    }

    public void updateTest() {
        // TODO: list의 요소를 수정하고 출력해보자.
    	System.out.println("수정 전: " +list);
    	list.set(1, "Nice");
    	System.out.println("수정 후: " +list);
        // END
    }

    public void deleteTest() {
        // TODO: list의 내용을 삭제해보자.
    	System.out.println("삭제 전: " +list);
    	list.remove(1); // 1이 삭제될줄 알았는데 그 index번호 자리가 삭제됨 
    	System.out.println("삭제 후1 : " +list);
    	list.remove("Java"); // 객체 기반 삭제 
    	System.out.println("삭제 후2 : " +list);
    	list.remove(Integer.valueOf(1)); //값을 삭제하는 식 - 앞에서부터 삭제 
    	System.out.println("삭제 후3 : " +list);
    	list.addAll(List.of(2, 3, 4, 5, 6));
    	
    	
    	//list.of는 변경 불가 그대로만 써야한다. 
    	List<Integer> ints = new ArrayList<>(List.of(1, 2, 4, 6));
    	System.out.println(ints);
    	for (int i = 0; i < ints.size(); i++) {
			if(ints.get(i)%2 ==0) {
				ints.remove(i--);
				}
				
//    	//차라리 뒤에서부터 하면 배열이 앞당겨지는 현상이 없으면서 가능하게 됨
//    	for (int i = ints.size()-1; i>=0; i--) {
//    		if(ints.get(i)%2 ==0) {
//    			ints.remove(i);
//			}
			
		}
    	System.out.println("짝수 삭제 후: " +ints);
        // END 
    }

    public static void main(String[] args) {
        ArrayListTest alt = new ArrayListTest();
        alt.createTest();
        alt.retrieveTest();
        alt.updateTest();
        alt.deleteTest();
    }
}
