package Sample;

import java.util.Scanner;

public class Tests {

	static int count=0;
	static Helper hp = new Helper();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num = 87;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		stepsToPalindrome(num);

	}

	public static void stepsToPalindrome(int num) {
		// TODO Auto-generated method stub
		
		if(!(hp.checkisPalindrome(num))) {
			count++;
			num = num+hp.reverse(num);
			stepsToPalindrome(num);
		}
		else {
			System.out.println("Steps to be palindrome "+ count);
		}
	}



}
