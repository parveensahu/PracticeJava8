package Problems;

public class RepeatedNumberInArray {
//Solution 1
	/*
	public void findDuplicate(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]);
					System.out.println();
				}
			}
		}
	}

	public static void main(String args[]) {
		RepeatedNumberInArray object = new RepeatedNumberInArray();
		int arr[] = { 4, 3, 4, 5, 6, 6, 7 };
		object.findDuplicate(arr);
	}
	*/
	
	 void printRepeating(int arr[], int size) 
	    {
	        int count[] = new int[size];
	        int i;
	 
	        System.out.println("Repeated elements are : ");
	        for (i = 0; i < size; i++) 
	        {
	            if (count[arr[i]] == 1)
	                System.out.print(arr[i] + " ");
	            else
	                count[arr[i]]++;	
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	    	RepeatedNumberInArray repeat = new RepeatedNumberInArray();
	        int arr[] = {4, 2, 4, 5, 2, 3, 1};
	        int arr_size = arr.length;
	        repeat.printRepeating(arr, arr_size);
	    }
}