package Sample;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A = {0,1,1,0};
		System.out.println(Minflip(A));
		

	}
	
	private static int Minflip(int[] a) {
		int startwith0 = getFlipcount(a, 0);
		int startwith1 = getFlipcount(a, 1);
	    return Math.min(startwith0, startwith1);
	 }

	private static int getFlipcount(int[] a, int start) {
		// TODO Auto-generated method stub
		
		int Count = 0;
		  for (int i = 0; i < a.length; i++) {

		   if (a[i] != start)
			   Count++;

		   start = flip(start);
		  }
		  return Count;
		
	}
	
	private static int flip(int i) {
		  return (i == 0) ? 1 : 0;
		 }

}
