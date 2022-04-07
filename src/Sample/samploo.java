package Sample;

public class samploo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] source = {10,99,87,85,96,174,55,42,74,8,12,178};
		
		int max =source[0];
		int secondmax =0;
		
		
		for(int i=1;i<source.length;i++) {
			int temp =source[i];
			if(temp>max) {
				secondmax=max;
				max=temp;
			}else if(temp>secondmax){
				secondmax=temp;
			}
		}
		System.out.println("first largest is "+max );
		System.out.println("Second largest is "+secondmax);
		
		//TC-1: Positive scenario - Input the Normal Integer values in the Array and verify the output.
		//TC-2: Input the Negative Interger in the Array and verify the Output.
		//TC-3: Input the Strings in the Array and verify the output.
		//TC-4: Input the Floats in the Array and verify the output.
		//TC 5: Input 10 Million values in the array and verify the Output.
		
		

	}

}
