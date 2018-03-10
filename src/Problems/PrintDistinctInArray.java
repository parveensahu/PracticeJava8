package Problems;

public class PrintDistinctInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 8, 6, 7, 8, 2, 5, 4 };

		for (int i = 0; i < arr.length; i++) {
			boolean isDistinct = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDistinct = true;
					break;
				}
			}
			if(!isDistinct) {
				System.out.print(arr[i] + ",");
			}
		}
	}

}
