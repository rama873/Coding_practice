package Sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="ccaaffddecee";
		int result = getMinDeleteCount(input);
		System.out.println(result);

	}
	   public static int getMinDeleteCount(String input){

	        HashMap<String, Integer> map = new HashMap<String, Integer>();
	        String[] strarr = input.split("");
	        for(int i =0; i<strarr.length;i++){
	        	if(map.containsKey(strarr[i])){
	        		map.put(strarr[i],(map.get(strarr[i])+1));
	        	}
	        	else{
	        		map.put(strarr[i],1);
	        	}
	        }

            List<Integer> list = new ArrayList<Integer>(map.values());
	        Collections.sort(list, Collections.reverseOrder());
	        Integer[] counts = list.toArray(new Integer[list.size()]);

	        int deletions=0;
	        for (int i = 0; i <counts.length-1 ; i++) {
	            for (int j = i+1; j <counts.length ; j++) {
	                if (counts[i]>0 && counts[i]==counts[j]){
	                    int count = counts[j];
	                    counts[j] = count - 1;
	                    deletions++;
	                }else
	                    break;
	            }
	        }
	        return deletions;
	       
	    }
}
