package java_examples.Collection_exampless;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap_iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap<String,Integer> hs = new  HashMap<String, Integer>();
 hs.put("Rama", 2);
 hs.put("Krishna", 4);
 hs.put("RObbby", 6);
 hs.put(null, 6);
 
 Iterator<String> it = hs.keySet().iterator();
 
 //First way lo iterarting a hashmap
 while(it.hasNext()) {
	 String key = it.next();
	 int value = hs.get(key);
	 System.out.println(key+" iterator "+value);
 }

 //Second way lo iterarting a hashmap
 for(Map.Entry<String,Integer> map : hs.entrySet()) {
	 System.out.println(map.getKey()+" map.entry "+map.getValue());
 }
 
 //third way of iterating a hasmap.
 hs.forEach((k,v)-> System.out.println(k+" foreach "+v));
	}

}
