package ch13_collection.c_map;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
    // TODO: key:value의 구조로 값을 저장하기 위한 자료구조를 생성하시오. (key, value 모두 String으로)
	Map<String, String> map = new HashMap<>();
	
    // END

    private void addMethod() {
        // TODO: 위 자료구조에 자료를 추가해보자.
    map.put("hong", "010-111");
    map.put("hong", "010-123"); //동일한키값
    map.put("jang", "010-123");
    map.put("kim", "123");
    map.put("lim", "456"); 
    System.out.println(map); //키값 순서 없고 키가 중복되지않음. 
        // END
    }

    private void retrieveMethod() {
        // TODO: 위 자료구조에서 다양한 정보를 조회해보자.
    	System.out.println("hong포함?" + map.containsKey("hong"));
    	System.out.println("값으로 hong포함?" + map.containsValue("hong"));
    	System.out.println("키로 값 조회: "+ map.get("hong"));
    	System.out.println(map.getOrDefault("andy", "1234567"));
    	System.out.println(map.size());
    	
    	Set<String> keys = map.keySet();
    			for (String key: keys) {
    				System.out.println(map.get(key));    				
    			}
    	
    	Set<Entry<String, String>> entries =  map.entrySet();
    	for(Entry<String, String> e:entries) {
    		System.out.println(e.getKey()+ ":" +e.getValue());
    	}
        // END
    }

    private void removeMethod() {
        // TODO: 위 자료구조에서 데이터를 삭제해보자.
    	System.out.println("삭제 전 : " +map);
    	map.remove("hong");
    	System.out.println("삭제 후 : " +map);
    	map.clear();
    	System.out.println("삭제 후 : " +map);
        // END
    }

    public static void main(String[] args) {
        HashMapTest hmt = new HashMapTest();
        hmt.addMethod();
        hmt.retrieveMethod();
        hmt.removeMethod();
    }
}
