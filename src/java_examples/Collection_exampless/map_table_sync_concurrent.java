package java_examples.Collection_exampless;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class map_table_sync_concurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Hashmap --> Non synchronized - Good performance
		//HasTable --> Legacy one - synchronized - slow performance
		
		
		//synchronized map
		//Slow performance
		Map<String,Integer> nonsync = new HashMap<String,Integer>();
		nonsync.put("Rama", 2);
		nonsync.put("Krishna", 4);
		nonsync.put("RObbby", 6);
		
		Map<String,Integer> sync = Collections.synchronizedMap(nonsync);
		 
		
		//Concurrent hashmap.
		//Lock will be apply on segment of hashnode for write operations
		//No lock on read operations
		//Synchronized and Good Performance
		ConcurrentHashMap<String,Integer> conmap = new ConcurrentHashMap();
		conmap.put("Rama", 2);
		conmap.put("Krishna", 4);
		conmap.put("RObbby", 6);
		

		
		 
	}

}
