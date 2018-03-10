package ArrayRotation;

public class FindOutGCD {

	public int calculateGCD(int n1, int n2, int n3) {
		int range;
		if(n1<n2 && n1<n3) {
			range = n1;
			
		}
		else if (n2<n1 && n2<n3){
			range = n2;
		}
		
		else {
			range = n3;
		}
		int r = 0;
		for(int i = 2; i<range; i++) {
			if(n1%i == 0 && n2%i == 0 && n3%i == 0) {
				r = i;
			}
		}
		return r;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindOutGCD obj = new FindOutGCD();
		int gcd = obj.calculateGCD(24,24,48);
		System.out.println(gcd);
	}

}
