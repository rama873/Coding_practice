package Arrays_test;

public class Sum_of_two_number_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 34;
        int i=num-1;
			for(int j=1;j<=i;j++) {
				if(checkPrimeNumber(i) && checkPrimeNumber(j)) {
					if(i+j==num) {
						System.out.println("First Number is "+i+"-------"+"second Number is "+j);
					}
				}
				i--;
			}
		
		
		
		
		//System.out.println(checkPrimeNumber(num));

	}

	private static boolean checkPrimeNumber(int num) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<num;i++) {
			if(num>0 && num%i==0) {
				count++;
			}
		}
		if(count==1) {
			return true;
		}else {
			return false;
		}
	}

}
