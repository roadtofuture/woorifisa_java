package ch03_operator.monadic;

public class MonadicOperation {
    public static void main(String[] args) {
        // TODO: 각 단계에서 출력되는 값과 메모리에서의 값을 생각해보세요.
        int i = 5;
        i++; // 출력한 뒤 더해짐 더해졌으니 6
        System.out.println(i); //6 (지금은 6) 
        ++i; // 1더해졌으니까 지금 7 
        System.out.println(i); //7 (지금 7)

        int j = ++i; //7에서 하나 더해진 8이 j로 들어감
        System.out.println(j++); //8, 더해지기 전의 값
        System.out.println(--j); //8, 더해졌기 때문에 지금 9,1 빼고 나서 출력이니까 8 
    }
}
