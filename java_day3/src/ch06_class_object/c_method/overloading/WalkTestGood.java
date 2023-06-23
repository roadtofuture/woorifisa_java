package ch06_class_object.c_method.overloading;
//하는 일이 같다 
public class WalkTestGood {
    void walk() {
    	//중복 코드 방지!
    	//
        walk(100, "cm");
    }

    // TODO: walk 메서드를 overloading 해보자.

    // END

    public static void main(String[] args) {
        WalkTestGood wtg = new WalkTestGood();
        wtg.walk();
        //wtg.walk(100);
        //wtg.walk(100,"cm");

    }

}

// 필기 빌리기 