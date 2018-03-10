package ReverseString;

public class ReverseStringwithSpaces {

	public static void main(String args[]) {
		String str = "I love programming very much";
		
		/*
		 * str =str.toLowerCase(); System.out.println(str); str = str.replace(" ","");
		 * System.out.println(str); char[] chararr = str.toCharArray(); int len =
		 * chararr.length; char[] chararr1 = new char[chararr.length]; int j = 0;
		 * for(int i = len-1; i>=0; i--) { chararr1[j] = chararr[i]; j++; }
		 * System.out.print(chararr1); }
		 */

		String[] strarr = str.split(" ");
		int len = strarr.length;
		for(int i = 0; i<len;i++) {
			System.out.println(strarr[i]);
		}

		String[] str1arr = new String[len];
		int j = 0;
		for (int i = len-1; i >= 0; i--) {
			str1arr[j] = strarr[i];
			System.out.println(str1arr[j]);
			j++;
			
		}
		
	}
	
}
