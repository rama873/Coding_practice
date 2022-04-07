package Sample;

public class Test {
	static int num=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String name = "Rama krishna";
		
		int fact = 5;
		
		System.out.println(Factorial(fact));

	}

	private static int Factorial(int fact) {
		// TODO Auto-generated method stub
		
		if(fact>0) {
		num = num * fact;
	  Factorial(fact-1);
		}
		
		
		return num;
	}

	private static String StringReverse(String name) {
		// TODO Auto-generated method stub
		String result="";
		String[] charArray = name.split("");
		int i=1;
		
//		for
//		if() {
//			result =result + StringReverse();
//		}
		
//		for(int i=0;i<name.length();i++) {
//			result = result + name.charAt(i);
//		}
//		
		return result;
	}

}
