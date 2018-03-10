package ArraysFill;

import java.util.Arrays;

public class FillArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 2, 4, 5, 10, 40 };
		
		// Fill the array with element
		//Arrays.fill(arr, 10);
		
		System.out.println(Arrays.toString(arr));
		
		// Fill the array with element on desired indexes
		Arrays.fill(arr, 0,2,10);
		
		System.out.println(Arrays.toString(arr));
	}

}
