package Arrays_test;

public class Array_Minimun_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {4,7,2,5,10,3,2,8,5,2,4,2,7,3,6,1,2,3,5,3,3,3,4,5,7,8};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		

	}

}
