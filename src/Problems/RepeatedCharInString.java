package Problems;

import java.util.HashMap;
import java.util.Set;

public class RepeatedCharInString {

	public static void duplicatechar(String str) {
		//Break into characters
		char[] charArr = str.toCharArray();
		//Initialize Map
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		//Traverse Char Arr with for each
		for(Character ch:charArr) {
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch)+1);
			}
			else {
				hmap.put(ch, 1);
			}
		}
		//Print the result
		Set<Character> keyset=hmap.keySet();
		for(Character c:keyset) {
			if(hmap.get(c)>1) {
				System.out.println(c + "  appears  " + hmap.get(c) + "  times");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedCharInString obj = new RepeatedCharInString();
		String str = "praveensahu";
		obj.duplicatechar(str);
	}

}
