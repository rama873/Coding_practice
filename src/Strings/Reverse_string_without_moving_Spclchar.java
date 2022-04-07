package Strings;

public class Reverse_string_without_moving_Spclchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "I_ love& my# co{untry";
		char[] charArray = s.toCharArray();
		//y_ rtnu& oc# ym{evolI
		int r = charArray.length - 1, l = 0;
        while (l < r)
        {
            // Ignore special characters
            if (!Character.isAlphabetic(charArray[l]))
                l++;
            else if(!Character.isAlphabetic(charArray[r]))
                r--;
 

            else
            {
                char tmp = charArray[l];
                charArray[l] = charArray[r];
                charArray[r] = tmp;
                l++;
                r--;
            }
        }
		
		
        String revStr = new String(charArray);
		System.out.println(revStr);
	}

}
