/**
 * 
 */
package ch05_array.advanced;

/**
 * @author Administrator
 *
 */
public class IteratorFor2 {
    static int[] arr = { 10, 20, 30, 40, 50 };
    static int[][] arr2 = { { 10 }, { 20 }, { 30 }, { 40 }, { 50 } };
    
    public static void main(String[] args) {
        //dim1();
        dim2();
    }

    private static void dim1() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("normal dim 1 : " + arr[i]);
        }
        System.out.println("==============================");
        
        for (int i :arr) {
            i=i*2;
        }
        for (int i :arr) {
            System.out.println("iterator dim 1 : " + i);
        }
    }
    private static void dim2() {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i][0] = arr2[i][0]*2;
        }
        for (int i = 0; i < arr2.length; i++) {
            int[] arrsub = arr2[i];
            for (int j = 0; j < arrsub.length; j++) {
                System.out.println("normal dim 2 : "+arrsub[j]);
            }
        }
        System.out.println("==============================");
        for (int [] arrsub :arr2) {
            arrsub[0] = arrsub[0]*2;
        }
        for (int ints[] :arr2) {
            for (int j: ints) {
                System.out.println("iterator dim 2 :"+j);
            }
        }
    }
}
