package Arrays_test;

import java.util.ArrayList;
import java.util.Arrays;

public class Interger_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 439;
		String s= "";
		while(num>0) {
			s = s+num%2;
			num=num/2;
		}
		StringBuilder str = new StringBuilder(s);
		StringBuilder binary = str.reverse();
		int count=0;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<binary.length();i++) {
			if(binary.charAt(i)=='1') 
				count++;
			else {
			   al.add(count);
			   count=0;
			}
		}
		al.add(count);
		int highest =0;
		for(int i=0;i<al.size();i++) {
			if(highest<al.get(i))
				highest =al.get(i);
		}
		System.out.println(highest);
	}

}
