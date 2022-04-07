package Strings;

import java.util.Scanner;

public class String_Repeated {
	public static void main(String[] args) {
       
		String s = "abc";
		int l =s.length();
		long n =100000000L;
		int count =0;
		
//		for(int i=0;s.length()<n;i++) {
//		 for(int j=0;j<l;j++) {
//			 if(s.length()<n)
//			s=s+s.charAt(j);
//		 }
//		}
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='a') {
//				count++;
//			}
//		}
//		System.out.println(count);
    
	
	long num = n/l;
	long rem = n%l;
	
	for(int i=0;i<s.length();i++) {
		if (s.charAt(i)=='a') {
            count += num;
            if (i < rem)
                count++;
	}
	
	}
	System.out.println(count);
	}
	
}
