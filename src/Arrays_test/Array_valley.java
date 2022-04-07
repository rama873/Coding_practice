package Arrays_test;

public class Array_valley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "DUDDUUUUDDD";
		
		int step=0; 
		int estep=0;
		int valley=0;
		for(int i=0;i<path.length();i++) {
			if(path.charAt(i)=='U') {
				step++;
			}else if(path.charAt(i)=='D') {
				step--;
			}
			if(estep==-1 && step==0) {
				valley++;
			}
			estep = step;
		}
		System.out.println(valley);

	}

}
