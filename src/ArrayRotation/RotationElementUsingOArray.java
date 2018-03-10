package ArrayRotation;
import java.util.Arrays;

public class RotationElementUsingOArray {

	public static void rotateElement(int a[], int l, int d) {
		//Part1 
		int tmp[] = new int[d];
		tmp = Arrays.copyOfRange(a, 0, d);
		System.out.println(Arrays.toString(tmp));
		/*
		for (int i = 0; i<d; i++) {
			tmp[i] = a[i];
		}
		System.out.println(Arrays.toString(tmp));
		*/
		//Part2
		for(int i = 0; i<l-d; i++) {
			a[i] = a[i+d];
		}
		System.out.println(Arrays.toString(a));
		
		//Part3
		for(int i=0; i<d; i++) {
			a[(l-d)+i] = tmp[i];
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 2, 4, 5, 10, 40 };
		int d = 4;
		rotateElement(arr, arr.length, d);
	}

}
