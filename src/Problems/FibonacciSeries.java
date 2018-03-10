package Problems;

public class FibonacciSeries {
	
	public static void printFibonacciSeries(int num) {
		int x = 0, y = 1, z = 0;
		System.out.print(x + " " + y);
				
		for(int i = 0; i<num; i++) {
			z = x + y;
			System.out.print(" " + z);
			x = y;
			y = z;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries.printFibonacciSeries(20);
	}

}
