package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMissingNumberArray {
	
	public static void findMiss(int[] a) {
		int sum = 0, n = a.length + 1;
		int totalSum  = (n*(n+1)*((2*n)+1))/6;
		for(int i = 0 ; i<a.length ; i++) {
			sum  = sum + a[i];
		}
		System.out.println(totalSum);
		System.out.println(sum);
		System.out.println((totalSum - sum));
	}

	public static void findMissing(int[] a, int n) {
		Arrays.sort(a);
		for(int i=0;i<n;i++) {
			if(a[i] == (i+1)*(i+1)) {
				continue;
			}
			else {
				System.out.println("Missing Number is: " + (i+1)*(i+1));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,9,16,25,36,64,4};
		findMiss(arr);
	}

}
