package Arrays_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Leftrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		//rotLeft(a,4);
		optimizerotLeft(a,2);

	}
	
	private static void optimizerotLeft(List<Integer> a, int d) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[a.size()];
		arr = a.toArray(arr);
		int[] resultarr = new int[arr.length];
		int i=0;
		int rotate =d;
		while(rotate<arr.length) {
			resultarr[i] =arr[rotate];
			rotate++;
			i++;
		}
		rotate=0;
		while(rotate<d) {
			resultarr[i]=arr[rotate];
			rotate++;
			i++;
		}
		List<Integer> list = new ArrayList<>();   
		//using for-each loop to iterate over the array  
		for (Integer t : resultarr)   
		{   
		//adding each element to the List  
		list.add(t);   
		}  
		System.out.println(Arrays.toString(resultarr));
		
	}

	public static void rotLeft(List<Integer> a, int d) {
	    // Write your code here
		
		for(int k=0;k<d;k++) {
		int temp = a.get(0);
	    for(int j=0;j<a.size()-1;j++){
	    	for(int i=j+1;i<j+2;i++)
	        a.set(j, a.get(i));
	    }
	    a.set(a.size()-1,temp);
	    }

	System.out.println(a.toString());
	}


}
