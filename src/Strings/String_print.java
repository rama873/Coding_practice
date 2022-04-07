package Strings;

import java.util.Scanner;

public class String_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
        Scanner sc=new Scanner(System.in); 
        n=sc.nextInt();  
        String[] arr = new String[n];
        sc.nextLine();
        for(int i=0; i<n; i++)  
         {      
           arr[i]=sc.nextLine();  
        } 
        
        for(int j=0;j<n;j++){
            for(int i=0;i<arr[j].length();i++){
                System.out.print(arr[j].charAt(i)); 
                i++;
            }
            System.out.print(" ");
            for(int k=1;k<arr[j].length();k++) {
            	System.out.print(arr[j].charAt(k)); 
                k++;
            }
            System.out.println();
        }
	}

}
