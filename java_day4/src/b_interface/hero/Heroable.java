package b_interface.hero;

interface Fightable {
	void fire();	
}

interface Transformable {
	void changeShape();
}
// TODO: Fightable과 Transformable을 상속받는 Heroable을 작성하시오.
//  Heroable은 upgrade() 할 수 있다.

	public interface Heroable extends Fightable, Transformable {
		void upgrade();		
	}
// END
