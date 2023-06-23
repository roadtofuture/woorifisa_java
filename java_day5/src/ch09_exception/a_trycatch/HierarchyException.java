package ch09_exception.a_trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HierarchyException {

    public static void main(String[] args) {
        String src = "./.project";
        try {
            FileInputStream input = new FileInputStream(src);
            int readData = -1;

            while ((readData = input.read()) != -1) {
                System.out.print((char) readData);
            }catch (FileNotFoundException) {
            	
//            }catch (IOException) {
//            	
//            }
            
        System.out.println("파일 읽음 완료!");
    }
}

//public class FileNotFoundException extends IOException {
        //이미 상속받고 있기 때문에 파일낫파운드가 위에 올라가서 먼저 걸러내줘야함 