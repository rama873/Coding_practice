package Strings;

public class super_reduced_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaabccddd";
		StringBuilder s = new StringBuilder(str);
		String Reduced_String = "";
		
       for(int i=0;i<s.length();i++) {
    	   for(int j=i+1; j<s.length() && j<i+2 ;j++) {
    		   if((s.charAt(i) == s.charAt(j))) {
    			   s.deleteCharAt(i);
    			   s.deleteCharAt(i);
    			   i=-1;
    		   }
    	   }
    	   }
       String reslt = s.toString();
       if(s.isEmpty()) {
    	   System.out.println("Empty String");
       }else {
    	   System.out.println(s);
       }
	}

}
