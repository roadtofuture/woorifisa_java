package ch05_array.basic;

public class MultiDimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int [] nums1 = new int[2];
		nums1[0] = 1;
		nums1[1] = 2;
		
		
		int[][] nums2 = new int[2][];
		nums2[0] = nums1;
		nums2[1] = new int [] {2, 3, 4, 0}; //관리하려는 대상을 넣어주면 된다,,,? 
		
		System.out.println(nums2.length);
		System.out.println(nums2[0].length);
		System.out.println(nums2[1].length);
		nums2[1][3] =100;
		nums2[0][0] = 1000;
		
		System.out.println(nums1[0]);
	} 

}
