package Arrays_test;

import java.util.Arrays;

public class Arrays_maxim_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int size =fact(arr.length);
		int[] result = new int[size];
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				result[count++]= Math.abs(arr[i]-arr[j]);
				
			}
		}
		//Get maximum of the number.
		int maximumDifference =0;
		for(int i=0;i<result.length;i++) {
		if(maximumDifference<result[i]) {
			maximumDifference=result[i];
		}
		}
		System.out.println(maximumDifference);
	}

	private static int fact(int length) {
		// TODO Auto-generated method stub
		int fact =0;
		for(int i=0;i<length;i++) {
			fact =fact +i;
		}
		return fact;
	}

}
