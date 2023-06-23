package ch08.e_generic.wide;

public class UseWildCardTest1 {
    public void wildCardTest() {
        GenericBox<Object> pObj = new GenericBox<>();
        GenericBox<Person> pPer = new GenericBox<>();
        GenericBox<SpiderMan> pSpi = new GenericBox<>();

        GenericBox<?> pAll = pPer; // 타입 무관! 모두다 할당 가능
        pAll = pSpi;
        pAll = pObj;

        GenericBox<? extends Person> pChildPer = pPer;
        pChildPer = pSpi;
        //pChildPer = pObj;  // Person 또는 Person을 상속 받은 자손만 가능

        GenericBox<? super Person> pSuperPer = pPer;
        //pSuperPer = pSpi; //Person 또는 Person의 조상만 할당 가능
        pSuperPer = pObj;
    }
}
