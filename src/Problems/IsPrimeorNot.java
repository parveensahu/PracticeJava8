package Problems;

public class IsPrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int num = 7;
		boolean isPrime = true;
		for(int i =2; i<num/2; i++) {
			temp = num%i;
			if(temp == 0) {
				isPrime = false;
				break;
			}
			
		}
		if(isPrime) {
			System.out.println("Prime Number is:" + num);
		}
		else {
			System.out.println("Not a prime number"+ num);
		}
	}

}
