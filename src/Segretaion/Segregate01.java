package Segretaion;

public class Segregate01 {

	public static int[] segregate01(int[] arr) {
		//Initialize the counter
				int count = 0;
				
				//Calculate the length of an array
				int length = arr.length;
				
				//Calculate the number of the 0's
				for(int i = 0; i<=length-1; i++) {
					if(arr[i] == 0) {
						count++;
					}
				}
				
				//Insert 0 until the length of 0's
				for(int i = 0; i<=count-1; i++) {
					arr[i] = 0;
				}
				
				//Insert 1 in remaining length
				for(int i = count; i<=length-1; i++) {
					arr[i] = 1;
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
