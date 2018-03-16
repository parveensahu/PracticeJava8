package MicrosoftProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelsRemove {

	public static String vowelRemove(String str) {
		Character ch[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		List<Character> al = Arrays.asList(ch);
		StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i < sb.length(); i++) {
			if (al.contains(sb.charAt(i))) {
				if (al.contains(sb.charAt(i + 1))) {
					i++;
				} else {
					if (al.contains(sb.charAt(i - 1))) {
						break;
					} else {
						sb.replace(i, i + 1, "");
						i--;
					}
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Caaeaat";
		String str_result = vowelRemove(str);
		System.out.println(str_result);
	}

}
