package Arrays_test;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int s= 15;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==s) {
					System.out.println(i+"++++++++"+j);
				}
			}
			
		}

	}

}
