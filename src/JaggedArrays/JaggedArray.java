package JaggedArrays;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaration of 5 rows array
		int[][] arr = new int[5][];

		// Creating 2D array having 1 element at first row, 2 in second row, 3 in third
		// row
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
		}

		// Initialization of 2D array
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}

		// Printing 2D Jagged array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
