package Arrays_test;

import java.util.HashMap;
import java.util.HashSet;

public class Duplicate_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Chicken", "Mutton","Chicken","Prawns","Fish","Prawns","Crab"};

		System.out.println("*******Brute Force mechanism******** Time complexity n2 ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equalsIgnoreCase(arr[j]))
					System.out.println(arr[i] +" is a Duplicate element");
			}
		}
		
		System.out.println("*******HashSet *******");
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<arr.length;i++) {
			if(hs.add(arr[i])==false) {
				System.out.println(arr[i] +" is a Duplicate element");
			}
		}
		
		System.out.println("*******Hashmap *******");
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hmap.containsKey(arr[i])) {
				System.out.println(arr[i] +" is a Duplicate element");
			}else {
				hmap.put(arr[i],1);
			}
		}
		
	}

}
