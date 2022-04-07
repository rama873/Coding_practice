package Arrays_test;

public class call_by_value {
	static int a=5;
	static int b=7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap();
		System.out.println(a+" main method "+b);
	}
	
	static void swap() {
		int temp=0;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" inside the method "+b);
	}

}
