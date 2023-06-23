package ch07.c_modifier.p2;

import ch07.c_modifier.p1.Parent;

public class OtherPackageChildClass extends Parent {
    public void useMember() {
        // TODO: Parent의 멤버 변수를 사용해보자.
        this.publicVar = 10;
        this.protectVar = 10;
        //this.defaultVar = 10;
        //this.privVar = 10;
        //this.none = 10;
    }
}
