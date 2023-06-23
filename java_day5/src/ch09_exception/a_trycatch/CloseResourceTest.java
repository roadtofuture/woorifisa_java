package ch09_exception.a_trycatch;

import java.io.FileInputStream;
import java.io.IOException;

public class CloseResourceTest {
    public static void main(String[] args) {
        CloseResourceTest crt = new CloseResourceTest();
        System.out.println("--있는 파일(정상적)인 경우");
        crt.useStreamOldStyle(".project");
        System.out.println("--없는 파일인 경우");
        crt.useStreamOldStyle("abc.txt");
    }

    // ****언제나 동작하는 코드
    public void useStreamOldStyle(String file) {
        FileInputStream fileInput = null;
        	try {
            fileInput = new FileInputStream(file); //시스템 리소스 사용 !!!!
            System.out.println("FileInputStream이 생성되었습니다.");
            fileInput.read();
        	} catch(IOException e) {
        		e.printStackTrace();
        	} finally {
        		if(fileInput !=null)
        		try {
        		fileInput.close(); //리소스 반납 
        		} catch(IOException ignore) { 
        			//닫다가 오류나는건 좀 ignore해달라는 편 
        		}
        	}
        }
    
//finally 대신 close할 수 있는 방법     
    // 좀 더 간단하게 쓸 수 있겠으나 항상 적용되는건 아님 **autoclosable**해야함 
            
    public void useStreamNewStye(String file) {
        try (FileInputStream fileInput = new FileInputStream(file)) {
            System.out.println("FileInputStream이 생성되었습니다.");
            fileInput.read();
        } catch (IOException e) {
            System.out.println("파일 처리 실패");
        }
    }
}
