package ch07.c_modifier.p1;

public class SamePackageChildClass extends Parent {
    public void useMember() {
        this.publicVar = 10;
        this.protectVar = 10;
        this.defaultVar = 10;
        this.privVar = 10;
        //this.none = 10; 보이지 않는 변수인지 없는 변수인지 구분할 줄 알아야 
        // TODO: Parent의 멤버 변수를 사용해보자.

        // END
    }
}
