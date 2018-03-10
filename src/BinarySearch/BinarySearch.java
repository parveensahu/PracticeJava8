package BinarySearch;

public class BinarySearch {
	//Method 1
	public static int binarySearch(int[] a, int l, int r, int x) {

		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (a[mid] == x)
				return mid;

			if (a[mid] > x)
				return binarySearch(a, l, mid - 1, x);

			return binarySearch(a, mid + 1, r, x);

		}

		return -1;

	}

	//Method 2
	public static int binarySearch1(int a[],int l,int r, int x) {
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(a[mid]==x) {
				return mid;
				
			}
			if(a[mid]<x) {
				l = mid + 1;
			}
			else {
				r = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Code to implement binary search i.e. pick the middle one and check the
		// element if less than the middle element than traverse the left elements and
		// vice versa

		int arr[] = new int[] { 2, 4, 5, 10, 40 };
		int n = arr.length;
		int x = 10;
		//int result = binarySearch(arr, 0, n-1, x);
		int result = binarySearch1(arr, 0, n-1, x);
		if (result == -1) {
			System.out.println("Element does not present");
		} else {
			System.out.println("Element present at index:" + result);
		}
	}

}
