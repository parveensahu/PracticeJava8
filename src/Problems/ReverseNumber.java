package Problems;

import java.util.Scanner;

public class ReverseNumber {
	//SOLUTION 1
	/*
	static int remainder, quotient;
	
	public static void reverseString(int num) {
		while(num! 	=0) {
			quotient = num/10;
			remainder = num%10;
			num = quotient;
			System.out.print(remainder);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber.reverseString(12345678);
	}
	*/
	
	//SOLUTION 2
	
	static int remainder = 0;
	
	public static void reverseString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number needs to reverse:");
		int num = scan.nextInt();
		while(num != 0) {
			remainder = num%10;
			num = num/10;
			System.out.print(remainder);
		}
	}
	
	
	public static void main(String args[]) {
		ReverseNumber.reverseString();
		
	}
}
