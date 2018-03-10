package Arrays;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,9,64,16,25,36,4};
		
		//Elements converted into String
		System.out.println(Arrays.toString(arr));
		
		//Sort the Elements
		Arrays.sort(arr,1,6);
		System.out.println(Arrays.toString(arr));
	}

}
