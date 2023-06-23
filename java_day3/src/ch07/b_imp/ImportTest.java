package ch07.b_imp;

import java.util.Date;
import java.util.List;
import static java.lang.System.out;

// TODO: 필요한 클래스를 import 해보자.

// END

public class ImportTest {
    // TODO: java.util.Date, java.util.List, java.io.InputStream, java.awt.List를 사용해보자.
	Date date; //ctrl+space해서 선택하면 자동으로 import됨
	List<String> list;
	java.awt.List mylist; //충돌나지 않게 다른 리스트를 쓰는 경우 full로 써줘야함
	
	public static void main(String[] args) {
		ImportTest it = new ImportTest();
		it.date = new Date;
		System.out.println(); //out은 static 멤버변수, 그냥 자동으로 올라가있음 
		//static import 결과 
		out.println();
	}
	
    // END
}
