package ch04_control.loop;

public class ForFormat {

    public static void main(String[] args) {
        for(int i=0, j=0; i<10; i++, j+=2){
            System.out.print(i + j+"\t");
        }
        
        for(boolean flag = true;flag;){
            System.out.println("무한 루핑");
        }
    }
}
