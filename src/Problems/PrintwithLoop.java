package Problems;

public class PrintwithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
		for(int j=1;j<=3;j++) {
			if(j==1) {
				System.out.print(i);
				System.out.println();
			}
			
			if(j==2) {
				System.out.print(i + " " + i);
				System.out.println();
			}
			if(j==3) {
				System.out.print(i + " " + i + " " + i);
				System.out.println();
			}
		}
	}

}
