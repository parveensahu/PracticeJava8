package ArraysCopy;
import java.util.Arrays;

public class ArrayCopyToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 2, 4, 5, 10, 40 };
		
		// Copied the extact array to different array
		int[] copied_array = Arrays.copyOf(arr, arr.length);
		System.out.println("Print copied Array:" + Arrays.toString(copied_array));
		
		//Copied the range in the array to the new Array
		int[] copied_range_array = Arrays.copyOfRange(arr, 1, 3);
		System.out.println("Print the range of the array:" + Arrays.toString(copied_range_array));
 	}

}
