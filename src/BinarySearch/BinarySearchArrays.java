package BinarySearch;
import java.util.Arrays;

public class BinarySearchArrays {

	public static void main(String args[]) {
		int arr[] = new int[] { 2, 4, 5, 10, 40 };
		int n = arr.length;
		
		//Arrays class provides an function which returns index of the seeked element in an array
		
		int index = Arrays.binarySearch(arr,2);
		System.out.println("Element is present in the index:" + index);
	}
}
