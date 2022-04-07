package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strong_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s = "2bbbb";
	int count =0;
	int length =0;

	if(s.length()<6) {
		length = 6-s.length();
	}
	
	String lowerregex = "^(?=.*[a-z]).+$";
	Pattern p = Pattern.compile(lowerregex);
	Matcher m = p.matcher(s);
	if(!(m.matches())) {
		count++;
	}
	
	String spclregex = "^(?=.*[-+_!@#$%^&*., ?]).+$";
	 p = Pattern.compile(spclregex);
	 m = p.matcher(s);
	if(!(m.matches())) {
		count++;
	}

	String upperregex = "^(?=.*[A-Z]).+$";
	 p = Pattern.compile(upperregex);
	 m = p.matcher(s);
	if(!(m.matches())) {
		count++;
	}
	
	String numericregex = "^(?=.*\\d).+$";
	 p = Pattern.compile(numericregex);
	 m = p.matcher(s);
	if(!(m.matches())) {
		count++;
	}
	
	if(count<length) {
		System.out.println(length);
	}else {
		System.out.println(count);
	}
	
	}

}
