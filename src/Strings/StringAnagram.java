package Strings;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="LISITTEEN";
		String s2= "SILEPNNNNNT";
		int count=0;
		String[] c = s1.split("");
		
		for(int i=0;i<c.length;i++) {
			if(!(s2.contains(c[i]))) {
				count++;
				break;
			}
		}
		String[] c2 = s2.split("");
		for(int j=0;j<c2.length;j++) {
			if(!(s1.contains(c2[j]))) {
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println(" is Anagram");
		else {
			System.out.println(" NOT Anagram");
		}

	}

}
