package ch07.c_modifier.p1;

public class SamePackageSomeClass {
    public void useMember() {
    	// TODO: Parent의 멤버 변수를 사용해보자.
    	Parent p = new Parent(); //먼저 new로 만들어줘야 
        p.publicVar = 10;
        p.protectVar = 10;
        p.defaultVar = 10;
        //p.privVar = 10; //
       
        // END
    }
}
