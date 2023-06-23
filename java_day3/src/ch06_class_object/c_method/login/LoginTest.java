package ch06_class_object.c_method.login;

public class LoginTest {
    public static void main(String[] args) {
        LoginSystem login = new LoginSystem();
        // TODO: 다양한 id,pass를 이용해서 LoginSystem의 doLogin을 사용해보자.
        LoginResult result = login.doLogin("admin", "1234");
        result.printResult();
        
        result = login.doLogin("admin", "12345");
        result.printResult();
        
        // END
    }
}
