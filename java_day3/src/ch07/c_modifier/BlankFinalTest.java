package ch07.c_modifier;

class FinalMemberClass {
	//reference type member - null 
    final String name;

    public FinalMemberClass(String name) {
        this.name = name; //final 변수에 대해서 '생성자에서' 딱 한번 초기화할 수 있는 (blank final 변수)
    }
    
    public void printName() {
    	System.out.println(this.name);
    }
}

class MyClass extends FinalMemberClass {
	public MyClass(String name) {
		super(name);
	}
	
	public void printName() {
		System.out.println("자식이 재정의" + name);
	}
}

public class BlankFinalTest {
    public static void main(String[] args) {
        FinalMemberClass fmc1 = new FinalMemberClass("hong");
        FinalMemberClass fmc2 = new FinalMemberClass("lim");

        System.out.printf("name: fmc1 - %s, fmc2 - %s%n", fmc1.name, fmc2.name);
        //The final field FinalMemberClass.name cannot be assigned
        //fmc1.name = "kim";
        
    }
}
