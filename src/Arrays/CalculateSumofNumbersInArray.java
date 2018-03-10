package Arrays;

public class CalculateSumofNumbersInArray {
	int sum = 0;

	public int calculateSumArray(int[] arr1) {

		for (int a : arr1) {
			sum = sum + a;
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateSumofNumbersInArray calcArr = new CalculateSumofNumbersInArray();
		int[] arr = { 1, 4, 6, 2, 3 };
		System.out.println(calcArr.calculateSumArray(arr));

	}

}
