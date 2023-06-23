package b_interface.hero;

public class IronManTest {

    public static void main(String[] args) {
        // TODO: IronMan에 다형성을 적용해보자.
    	Ironman iman = new Ironman();
    	Object obj = iman;
    	//interface로도 다형성은 적용된다
    	Heroable h = iman;
    	Transformable t = iman;

        // END
    }
}
