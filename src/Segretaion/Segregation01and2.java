package Segretaion;

import java.util.Arrays;

public class Segregation01and2 {

	public static int[] segregate01and2(int[] arr) {

		// Arrays.sort(arr);
		int l = 0;
		int r = arr.length - 1;
		int mid = 0;
		int tmp = 0;

		while (mid <= r) {
			switch (arr[mid]) {
			case 0: {
				tmp = arr[l];
				arr[l] = arr[mid];
				arr[mid] = tmp;
				l++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				tmp = arr[mid];
				arr[mid] = arr[r];
				arr[r] = tmp;
				r--;
				break;

			}
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 0, 1, 0, 2, 1, 0, 2, 0, 0, 1, 1, 0, 2 };
		int[] result = segregate01and2(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
