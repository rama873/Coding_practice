package Sample;



public class testtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
//	    Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] 
		
		int[] input = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int count =0;
		
		for(int i=0;i<input.length;i++) {
			if(input[i]==0) {
				input[count++]=0;
			}
		}
		while(count<input.length) {
			input[count++]=1;
		}
		
		for(int i=0;i<input.length;i++) {
		System.out.print(input[i]+ " ");
		}
	}

}
