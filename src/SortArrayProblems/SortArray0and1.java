package SortArrayProblems;

public class SortArray0and1 {

	public static int[] segregateArray(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			arr[i] = 0;
		}
		for (int i = count; i < n; i++) {
			arr[i] = 1;
		}
		return arr;
	}

	public static void printSegregateArray(int[] arr1, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr1[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
		int[] arr1 = segregateArray(arr, arr.length);
		printSegregateArray(arr1, arr.length);
	}

}
