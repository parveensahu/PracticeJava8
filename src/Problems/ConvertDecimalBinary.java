package Problems;

public class ConvertDecimalBinary {
	// Solution 1
	/*
	 * public static void convertion(int num) { int bin[] = new int[20]; int i = 0;
	 * while(num > 0) { bin[i++] = num % 2; num = num/2; }
	 * 
	 * for(int j = i-1 ; j>=0; j-- ) { System.out.println(bin[j]); } }
	 */

	// Solution 2
	static int bin[] = new int[100];
	static int i = 0;

	public static void convertion(int num) {
		if (num > 0) {
			bin[i++] = num % 2;
			convertion(num / 2);
		}
		int n = 0;
		for (i = i - 1; i >= 0; i--) {
			n++;
			System.out.println(bin[i]);
		}
		System.out.println("hllp=> " + n);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertDecimalBinary.convertion(25);
	}

}
