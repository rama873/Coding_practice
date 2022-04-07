package Sample;

public class Helper {
	
	public static boolean checkisPalindrome(int num) {
		// TODO Auto-generated method stub
		int original=num;
		int temp=0;
		int c=0;
		while(num>0) {
			temp =num%10;
			c =c *10 + temp;
			num=num/10;
		}
		if(c==original) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int reverse(int num) {
		// TODO Auto-generated method stub
		int temp =0;
		int c=0;
		while(num>0) {
			temp = num%10;
			c = c *10+ temp;
			num =num/10;
		}
		return c;
	}

}
