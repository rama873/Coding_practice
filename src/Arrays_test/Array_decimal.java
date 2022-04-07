package Arrays_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(-4, 3, -9, 0, 4, 1));

		
		double pos=0;
		double neg=0;
		double zero=0;
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>0)
				pos++;
			else if(arr.get(i)<0)
				neg++;
			else
				zero++;
		}
		System.out.println(String.format("%.6f",(pos/arr.size())));
		System.out.println(String.format("%.6f",(neg/arr.size())));
		System.out.println(String.format("%.6f",(zero/arr.size())));
		

	}

}
