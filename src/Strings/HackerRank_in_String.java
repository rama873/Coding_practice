package Strings;

public class HackerRank_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "heraeiamstkerrank";
		String target = "hackerrank";
		
		char[] c = source.toCharArray();
		int j=0;
		for(int i=0;i<c.length;i++) {
			if(c[i] == target.charAt(j)) {
				j++;
			}
			if(j==target.length()) {
				
			}
		}

	}

}
