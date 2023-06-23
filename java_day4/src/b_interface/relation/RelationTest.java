package b_interface.relation;

class Phone {}

class HandPhone extends Phone implements Chargeable{
    public void charge() {
        System.out.println("HandPhone 충전 중...");
    }
}

class Camera {}

class DigitalCamera extends Camera implements Chargeable{
    public void charge() {
        System.out.println("BlackBox 충전 중...");
    }
}

// TODO: 충전할 수 있는 기능을 가지는 Chargeable interface를 만들고 적용해보세요.
interface Chargeable {
	void charge();
	
}
// END

public class RelationTest {
    void badCase() {
        Object[] objs = { new HandPhone(), new DigitalCamera() }; // 두객체의 상위 타입인 오브젝트로 묶기 하지만 충전기능이 없어서 하나하나 캐스팅 단점이 있음. 
        for (Object obj : objs) {
            if (obj instanceof HandPhone) {
                HandPhone phone = (HandPhone) obj;
                phone.charge();
            } else if (obj instanceof DigitalCamera) {
                DigitalCamera camera = (DigitalCamera) obj;
                camera.charge();
            }
        }
    }

    void goodCase() {
        // TODO: Chargeable한 객체들을 관리하고 충전해보자. 
    	Chargeable [] chargeables = {new DigitalCamera(), new HandPhone()};
    	for(Chargeable c : chargeables) {
    		c.charge();
    	}
        // END
    }

    public static void main(String[] args) {
        RelationTest lct = new RelationTest();
        lct.badCase();
        lct.goodCase();

    }
}

//class를 이용한 단계: tight coupling 
//interface를 이용한 단계: loose coupling
