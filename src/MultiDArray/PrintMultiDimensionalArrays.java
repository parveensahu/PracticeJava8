package MultiDArray;

public class PrintMultiDimensionalArrays {
	
	public static void printMultiDArray(int[][] a) {
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[][] {{1,2,3},{4,5,6},{7,5,4}};
		printMultiDArray(arr);
	}

}
