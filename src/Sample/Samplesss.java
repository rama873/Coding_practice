package Sample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Samplesss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] source = {3,4,6,3,5,1,4,3,5,6,3,3,4,4,4};
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<source.length;i++) {
			if(map.containsKey(source[i])){
				map.put(source[i], map.get(source[i])+1);
			}else {
				map.put(source[i], 1);
			}
		}
		System.out.println(map);
		int maximum = Collections.max(map.values());
		
		for(Map.Entry<Integer,Integer> hs : map.entrySet()) {
			if(hs.getValue()==maximum) {
				System.out.println(hs.getKey() +" Is the most occured element");
			}
		}
		
	}

}
