package ch09_exception.c_custom;


public class CustomExceptionTest {
    private static String[] fruits = {"사과", "오렌지", "토마토"};

    public static void main(String[] args) {

        // TODO: 3. 위 동작을 예외로 처리해보자.
        try {
			getFruit2("사과");
			getFruit2("사과");
		} catch (FruitNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
        	setFruit("수박");
        	setFruit("사과");
        } catch (NoSpaceException e) {
        	e.printStackTrace();
        }
        // END
        System.out.println("창고 관리 끝~");
    }

    private static boolean getFruit1(String name) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != null && fruits[i].equals(name)) {
                fruits[i] = null;
                return true;
            }
        }
        return false;
    }

    // TODO: 2. 원하는 과일이 없는 상태에서 FruitNotFoundException을 발생시키도록 getFruit를 변경해보자.
    private static void getFruit2(String name) throws FruitNotFoundException {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != null && fruits[i].equals(name)) {
                fruits[i] = null;
                return;
            }
        }
        // 원하는 과일을 발견하지 못함 --예외 발생 
        throws new FruitNotFoundException(name+"은 없어요.");
    }
    // END

    // TODO: 5. 과일을 넣을 공간이 없을 때 NoSpaceException을 발생시키도록 setFruit를 만들어보자.
    private static void setFruit(String fruit) {
    	for (int i = 0; i < fruits.length; i++) {
			if(fruits[i] == null) { 
			fruits[i] = fruit;
			return;
		}
    }
    	throw new NoSpaceException(fruit+ "저장실패");
    // END
}



// TODO: 1. 과일이 없을 때 발생할 FruitNotFoundException을 checkedexception으로 만들어보자.
class FruitNotFoundException extends Exception {
	public FruitNotFoundException(String msg) {
		super(msg);
	}
}
// END

// TODO: 4. 공간이 없을 때 발생할 NoSpaceException을 unchecked exception으로 만들어보자.
class NoSpaceException extends RuntimeException {
	public NoSpaceException(String msg) {
		super(msg);
	}
}
// END
