package Sample;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String FunctionLocation = "FB-RE_TEST";
		String FunctionLocationDescription = "Dog in the Park";
		
		String NewClickField =null;
		
		if(FunctionLocation.startsWith("FB-RE")) {
			if(FunctionLocationDescription.contains("Park")) {
				NewClickField =FunctionLocationDescription;
				
			}
		}
		System.out.println(NewClickField);

	}

}
