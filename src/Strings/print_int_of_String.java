package Strings;

public class print_int_of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ccccAAoPPPlmWWA";
		String newString ="";
		int count =1;
		
		for(int i =0;i<s.length();i=i+count) {
			count =1;
			for(int j=i+1;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				count++;
			}else {
				newString =newString+s.charAt(i)+count;
				break;
			}
			}
		}
		System.out.println(newString+s.charAt(s.length()-1)+1);

	}

}
