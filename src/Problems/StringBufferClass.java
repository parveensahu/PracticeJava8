package Problems;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is read only and immutable
	     String str = new String ("Stanford  ");
	     System.out.println(str += "Lost!!");
	     //StringBuffer is fast than String 
	     StringBuffer str1 = new StringBuffer("Standford");
	     System.out.println(str1.append("Lost!!"));
	     
	}

}
