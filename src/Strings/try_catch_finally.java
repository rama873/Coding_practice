package Strings;

public class try_catch_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = getnum(0);
		System.out.println(result);
	}

	private static int getnum(int i) {
		// TODO Auto-generated method stub
		try {
			int b=50/i;
			return b;
		}catch(ArithmeticException e) {
			return 1;		
		}finally {
			return 222;
		}
	}

}
