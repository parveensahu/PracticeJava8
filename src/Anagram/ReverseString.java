package Anagram;

import java.util.Arrays;

public class ReverseString {
	
	public void reverse(String str, String str1) {
		String s1 = str.replaceAll(" ", "");
		String s2 = str1.replaceAll(" ", "");
		
		boolean status = true; 
	
		if(s1.length() != s2.length()) {
			status = false;
		}
		else {
		char[] charArr = s1.toLowerCase().toCharArray();
		char[] charArr1 = s2.toLowerCase().toCharArray();
		Arrays.sort(charArr);
		Arrays.sort(charArr1);
		status = Arrays.equals(charArr, charArr1);
		}
	
		if(status == true) {
			System.out.println("Is Anagram");
			
		}
		else {
			System.out.println("Not an Anagram");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		rs.reverse("Keep", "Peek");
	}

}
