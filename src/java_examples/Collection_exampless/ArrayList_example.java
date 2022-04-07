package java_examples.Collection_exampless;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayList_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList is dynamic Array
		//===========================================================================
		//Synchronnozed Arrays type-1
		ArrayList<Integer> nonsync = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,5,4,5,7,3,8,9));
		List<Integer> list = Collections.synchronizedList(nonsync);
		//Requires explict Synchronized while fetch values,
		//For add,remove does need explict synchonization.
		synchronized (list) {
		      Iterator i = list.iterator(); // Must be in synchronized block
		      while (i.hasNext())
		         System.out.println(i.next());
		  }

		//Synchronnozed Arrays type-2
		//Use CopyOnwriteArrayList which is synchonized by default.
		CopyOnWriteArrayList<String> copy = new CopyOnWriteArrayList<String>();
		copy.add("rama");
		
		//===========================================================================
		System.out.println("--------------------------------------------------------");
		//Remove duplicate Elementes -1
		ArrayList<Integer> at = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,5,4,5,7,3,8,9));
        TreeSet<Integer> tree = new TreeSet<Integer>(at);
		System.out.println(tree);
		
		//Remove duplicate Elementes -2
		//using Streams
		at.stream().distinct().forEach(ele -> System.out.println(ele));
		
		//===========================================================================
		//Arraylist -Comparasion.
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("a","d","e","b","c"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("a","d","e","b","c","f"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1.equals(l2));
		
		
	}

}
