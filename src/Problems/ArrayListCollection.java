package Problems;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 	
		System.out.println(al.size());
		al.add("D");
		al.add("O");
		al.add("N");
		al.add("I");
		al.add("S");
		al.add("B");
		al.add("A");
		al.add("C");
		al.add(1,"E");
		System.out.println(al.size());
		
		//Display the ArrayList
		System.out.println("Print the array list:" +al);
		
		//Remove the element from the arraylist
		al.remove(2);
		al.remove(0);
		al.remove("E");
		
		System.out.println("After deletion the arraylist is:" +al);
		
		
	}

}
