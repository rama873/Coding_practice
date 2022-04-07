package Arrays_test;

public class Start_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1		
//2 6		
//3 7 10
//4 8 11 12	
//5	9 13 14 15
		int n = 5;
		for(int i=0;i<n;i++) {
			for (int j = 2*(n - i); j > 1; j--) { //Loop for blank space

				System.out.print(" "); //Print Space

				}
			for (int j = 0; j <= i; j++) { 

				System.out.print(" * "); 

				}
			System.out.println();
		}
		

	}

}
