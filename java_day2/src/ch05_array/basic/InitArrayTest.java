package ch05_array.basic;

public class InitArrayTest {

    public static void main(String[] args) {
        // TODO: 다양한 방법으로 문자열 3개를 가지는 배열을 만들고 내용을 출력해보자.
    	String [] strs = new String[3];
    	strs[0] = "Hello";
    	strs[1] = "Java";
    	strs[2] = "World";
    			
        // END
    	
    	String [] strs2 = {"Hello", "Java", "World"};  //strs2는 그냥 배열을 참조하고 있는 변수. 배열이 아님. 왼쪽 strs2는 배열을 할당받은 것 뿐임 
    	//선언과 할당이 따로인 경우
    	strs2 = new String [] {"Good", "Morning", "Java", "World"};
    	
    }
}
