package Problems;

public class PrintPrimeNumbers {

	public static void main(String str[]) {
		int num=0,i=0;
		String primeNumber = "";
		for(i=1;i<=100;i++) {
			int counter = 0;
			for(num =i; num>=1;num--) {
				if(i%num == 0) {
					counter = counter + 1;
				}
			}
			if(counter == 2) {
				primeNumber = primeNumber + i + " ";
			}
		}
		System.out.println("Prime Numbers between 1 to 100 is:");
		System.out.println(primeNumber);
	}
}
