package java_examples.Collection_exampless;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class hashmap_comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String,Integer> map1 = new  HashMap<String, Integer>();
		 map1.put("Rama", 2);
		 map1.put("Krishna", 4);
		 map1.put("RObbbwy", 6);
		 map1.put(null, 6);
		 
		 HashMap<String,Integer> map2 = new  HashMap<String, Integer>();
		 map2.put("Rama", 2);
		 map2.put(null, 6);
		 map2.put("Krishna", 4);
		 map2.put("RObbbwy", 6);
		 map2.put("next", 4);
		 
		 //#1first way to comparre entire hasmap
		 System.out.println(map1.equals(map2));
		 
		 //#2comparing keys
		 System.out.println(map1.keySet().equals(map2.keySet()));
		 
		 // 3 Compare and get what is extra key in has map.
		 HashSet<String> hset = new HashSet<String>(map1.keySet());
		 hset.addAll(map2.keySet());
		 hset.removeAll(map1.keySet());
		 System.out.println(hset);
		 
		 //4 Compare values on duplicates are allowed
		 System.out.println(new ArrayList<Integer>(map1.values()).equals
				 (new  ArrayList<Integer>(map2.values())));
		 
		 //5 Compare values on duplicates are not allowed
		 System.out.println(new HashSet<Integer>(map1.values()).equals
				 (new  HashSet<Integer>(map2.values())));
	}

}
