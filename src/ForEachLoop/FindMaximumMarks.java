package ForEachLoop;

public class FindMaximumMarks {
	
	public static int findMaximumNumber(int[] numbers) {
		int maxmimum_marks = numbers[0];
		for(int number:numbers) {
			if(number>maxmimum_marks) {
				maxmimum_marks = number;
			}
		}
		return maxmimum_marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {102,100,120,130,140};
		int max = findMaximumNumber(marks);
		System.out.println("Maximum Marks is:" + max);
	}
}
