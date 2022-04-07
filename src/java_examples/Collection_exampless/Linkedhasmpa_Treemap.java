package java_examples.Collection_exampless;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Linkedhasmpa_Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//======================================================================
		
		//LinkedhashMap has all features oh hashmap,, only extra is Insertion order.
		//uses Double Linked List.
		Map<String,Integer> linkedsyn = new LinkedHashMap<String,Integer>();
		linkedsyn.put("Rama", 2);
		linkedsyn.put("Krishna", 4);
		linkedsyn.put("RObbby", 6);
		
		Map<String,Integer> hasp = new HashMap<String,Integer>(linkedsyn);
		
		System.out.println(linkedsyn);
		System.out.println(hasp);
		
		//==========================================================================
		//TreeMap uses Red- Black Tree Internally 
		Map<String,Integer> treeMap = new TreeMap<String,Integer>();
		treeMap.put("Aama", 22);
		treeMap.put("Krishna", 44);
		treeMap.put("RObbby", 16);
		treeMap.put("Test", 50);
		System.out.println(treeMap);
		
	}

}
