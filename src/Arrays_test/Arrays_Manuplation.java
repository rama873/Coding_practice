package Arrays_test;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_Manuplation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = {0,1,0,0,0,1,0};
		ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(0,0,1,0,0,1,0));
		Integer[] a = new Integer[c.size()];
		a =c.toArray(a);
		int steps=0;
		
		for(int i=0;i<a.length-1;i++) {
				if(a[i+1]==0) {
					try {
						if(a[i+2]<a.length) {
							if(a[i+2]==0) {
								steps++;
								i=i+1;
							}else {
								steps++;
						}
		             }
					}catch(ArrayIndexOutOfBoundsException e){
						steps++;
						break;
					}
				}else if(a[i+2]==0) {
					steps++;
					i=i+1;
				}
			
		}
		System.out.println(steps);
	}

}
