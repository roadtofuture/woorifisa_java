package ch07.c_modifier.encapsulation;

class UnbelievableUserInfo {
    //이름은 null이 될 수 없음.
    private String name = "홍길동";
    // 계좌는 0보다 커야 함.
    private int account = 10000;
    
    public void setName(String name) {
    	if(name!=null) {
    		this.name = name;
    	} else {
    		System.out.println("name은 null일수없다");
    	}
	}
    
    
    public String getName() {
		return this.name;
	}
    
    public void setAccount(int account) {
    	if(account>0) {
    		this.account = account;
    	} else {
    		System.out.println("account는 0보다 커야 한다");
    	}
	}
    public int getAccount() {
    	return this.account;
}
    
 //getName, setName(getter,setter) -> 'ctrl + space' 해보기 
}

public class UnbelievableTest {
    public static void main(String[] args) {
        UnbelievableUserInfo info = new UnbelievableUserInfo();
        System.out.printf("사용자 정보:%s, %d%n", info.getName(), info.getAccount());
        //info.name = null;
        info.setName(null);
        //info.account = -1000;
        info.setAccount(-1000);
        System.out.printf("사용자 정보:%s, %d%n", info.getName(), info.getAccount());
        
    }
}
