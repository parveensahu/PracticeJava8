package CloneArray;

public class CloneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[][] {{1,2,3},{4,5,6},{7,5,4}};
		int cloneArr[][] = arr.clone();
		for(int i = 0; i<cloneArr.length; i++) {
			for(int j = 0; j<cloneArr.length; j++) {
				System.out.print(cloneArr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
