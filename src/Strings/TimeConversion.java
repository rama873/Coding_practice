package Strings;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "12:40:22PM";
		String hh = s.substring(0,2);
		String rest = s.substring(2,8);
		Integer i = Integer.parseInt(hh);
		String newHH= "";
		
		if(s.contains("AM")) {
			if(i==12) {
			i=0;  
			}
		}else {
			if(i!=12)
				i= i+12;
			
		}
		newHH = String.format("%02d" , i);
		System.out.print(newHH+rest);

	}

}
