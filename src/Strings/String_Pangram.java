package Strings;

public class String_Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "We";
        
      String str = checkpangram(s);
System.out.println(str);
        
	}

	private static String checkpangram(String s) {
		// TODO Auto-generated method stub
        s= s.toLowerCase();
//       for(char i=97;i<=122;i++) {
//       	if(!s.contains(String.valueOf(i))) {
//       		return "not pangram";
//       	}
//       }
        String[] str = s.split(""); 
        for(int i =0;i<str.length;i++) {
       if(!str[i].matches("[a-z ]")) {
    	   return "Not pangram";
       }
        }
		return "pangram";
       
//	return "pangram";
       
	}

}
