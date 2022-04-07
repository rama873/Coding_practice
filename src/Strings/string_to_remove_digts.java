package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class string_to_remove_digts {

	public static void main(String[] args) {
		
		
		String str = "52357356534533";
		
		ArrayList<Long> arrlist = new ArrayList<Long>();
		int count=0;
		int k=0;
		StringBuffer strbuff = new StringBuffer(str);
		
		for(int j=0;j<strbuff.length();j++) {
		for(int i=k+count;i<strbuff.length();i++){
			if(strbuff.charAt(i)=='5') {
				count=0;
				String s = strbuff.deleteCharAt(i).toString();
				arrlist.add(Long.parseLong(s));
				k=i;
				count++;
				break;
			}
			}
		strbuff = new StringBuffer(str);
		}
		
		System.out.println(arrlist);
	}

}
