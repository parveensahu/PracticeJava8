package Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr_output = new ArrayList<Integer>();
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(11);
		arr.add(22);
		arr.add(33);
		arr.add(49);
		arr.add(20);
		
		System.out.println(arr);
		
		for (Integer arr1:arr) {
			int sqrt = (int) Math.sqrt(arr1);
			
			 if(sqrt*sqrt != arr1) {
			 arr_output.add(arr1);
			 	           
		}
			
		
		}
		 System.out.println(arr_output);
		 System.out.println("Maximum Non Integer Square" + Collections.max(arr_output));
}}
