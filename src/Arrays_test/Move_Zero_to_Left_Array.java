package Arrays_test;

import java.util.Arrays;

public class Move_Zero_to_Left_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count =0;
		int arr[] = {1,0,2,3,7,0,53,0,7};
		for(int i=0;i<arr.length;i++) {
         if(arr[i]!=0) {
        	 arr[count++]=arr[i];
         }
        		}
		 while (count < arr.length)
             arr[count++] = 0;

		System.out.println(Arrays.toString(arr));
		
	}

}
