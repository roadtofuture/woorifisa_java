package ch06_class_object.c_method.login;

public class LoginSystem {
    /**
     * id가 admin, pass가 1234면 로그인 성공, 그렇지 않으면 실패인 doLogin 메서드를 작성하시오.
     * 성공인 경우 관리자님 반갑습니다. 실패인 경우 실패 사유를 담는 LoginResult를 반환한다.
     * 
     * @param id
     * @param pass
     * @return
     */

    // TODO: 위 javadoc을 참조하여 메서드를 작성하시오.
	public LoginResult doLogin(String id, String pass) {
		LoginResult result = new LoginResult(); // 두 개 이상의 값을 반환할 수 없기에 클래스에 담아서 result로 한번에 값을 반환 
		if(id.equals("admin")) {
			if(pass.equals("1234")) {
				result.result = true;
				result.msg="admin님 반갑습니다.";
			}else {
				result.result = false;
				result.msg = "비밀번호 확인!!!";
			}
		}else {
			result.result = false;
			result.msg = "아이디 확인!!!";
		}
		
		return result;
	}
	
	
	
	
    // END
}
