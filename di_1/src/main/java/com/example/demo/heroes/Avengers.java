package com.example.demo.heroes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Avengers {

	private Hulk hulk;    //빈
	private IronMan iman; //빈
	@Value("뉴욕") //할당하겠다는게 아니라 주입하겠다 addr에 
	private String addr;  //빈X - 스칼라 값이라 부름 
	@Value("${doorPass}") //application.properties에서 받아옴
	public String doorPassword;
	
	//new하긴 싫어서 주입받기로
	
	@Autowired //- 자동으로 연결되도록 
	public Avengers(Hulk hulk) { 
		this.hulk = hulk;		
	} 
	
	@Autowired
	public void setIronMan(@Qualifier("hulkBuster") IronMan iman) {  //camelCase로 써야만 한다 (**에러)
		this.iman = iman;
	}


	
}
