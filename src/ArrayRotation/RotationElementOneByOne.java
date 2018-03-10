package ArrayRotation;

import java.util.Arrays;

public class RotationElementOneByOne {
	
	public static void rotate(int a[], int l, int d) {
		
		for(int i =0; i<d; i++) {
			rotateElement(a);
		}
	}
		public static void rotateElement(int[] arr) {
			int tmp = arr[0];
			for(int i = 0; i<arr.length-1; i++) {
				arr[i] = arr[i+1];
				
			}
			arr[arr.length-1] = tmp;
			System.out.println(Arrays.toString(arr));
		}
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {2,4,5,10,40};
		int d =2;
		rotate(a, a.length, d);
	}

}
