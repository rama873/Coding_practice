package Sample;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String name = "ABCD";
//		char[] cArray = name.toCharArray();
//		for(int i=0;i<name.length();i++ ) {
//			System.out.println((int)cArray[i]);
//		}
		
//		A A A A 
//		B B B
//		C C
//		D		
		
		
		for(int i=4;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print((char)((5-i)+64));
			}
			System.out.println();
		}
		
		
		
		
	}

}
