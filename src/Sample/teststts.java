package Sample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class teststts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Ramam";

		String[] strarr = s.split("");
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for(int i =0; i<strarr.length;i++){
		if(map.containsKey(strarr[i])){
		map.put(strarr[i],(map.get(strarr[i])+1));
		}
		else{
		map.put(strarr[i],1);
		}
		}
		System.out.println(map);

		int max = Collections.max(map.values());

		for(Map.Entry<String, Integer> hs : map.entrySet()){
		if(max==hs.getValue()){
		System.out.println(hs.getKey() +" is the most occured letter in the string");
		}
		}

	}

}
