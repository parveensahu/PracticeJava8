package SortArrayProblems;

public class SortArrayTComplexLess {
	
	public static int[] sortArray(int[] arr, int n) {
		
		int left = 0, right = n-1;
		
		while(left<right) {
			//Navigate from left index until 0 is encountered
			while(left<right && arr[left] == 0 ) {
				left++;
			}
			while(left<right && arr[right] == 1) {
				right--;
			}
			
			if(left<right) {
				arr[left] = 0;
				arr[right] = 1;
				left ++;
				right --;
			}
		}
		
		return arr;
		
	}
	
	public static void main(String str[]) {
		
		int[] arr = new int[] {0,1,1,1,0,1,0};
		int n = arr.length;
		System.out.println(n);
		sortArray(arr, n);
		
		//Print Sorted Array
		
		for(int i = 0; i<n;  i++) {
			System.out.print(arr[i]);
		}
	
	}

}
