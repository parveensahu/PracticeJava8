package Segretaion;

public class Segregation0and1 {
	public static int[] segregate01(int[] arr) {
		int l = 0;
		int r = arr.length-1;
		
		while(l<r) {
			while(arr[l] == 0 && l<r) {
				l++;
			}
			while(arr[r] == 1 && l<r) {
				r--;
			}
			if(l<r) {
				arr[l] = 0;
				arr[r] = 1;
				l++;
				r--;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {0,1,0,1,1,0,1,0,0,1,1,0};
		int[] result = segregate01(arr);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
