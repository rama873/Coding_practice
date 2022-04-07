package Arrays_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraypairing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
		
		int count=0;
		for(int i=0;i<arr.size();i++) {
			for(int j=i+1;j<arr.size();j++) {
				
				if(arr.get(i)!=null && arr.get(i)==arr.get(j)) {
					count++;
					arr.set(i,null);
					arr.set(j,null);
					break;
				}
				
			}
		}
		System.out.println(count);

	}

}
