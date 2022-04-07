package Sample;

import java.util.Arrays;

public class sample_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isSpecial("y");
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int count =1;
//		String[] s2 = s.split("");
//		String[] target = new String[s.length()];
//		for(int i=0;i<s2.length;i++) {
//			if(!(isSpecial(s2[i]))) {
//			// 
//				int spclchar = s2.length-count;
//				if((isSpecial(target[spclchar]))) {
//					count++;
//					target[s2.length-count]= s2[i];
//				}
//				else {
//					target[spclchar]= s2[i];
//					count++;
//				}
//				
//			}
//			else {
//				target[i]=s2[i];
//			}
//		}
//		System.out.println(Arrays.toString(target));

		
	}
		private static boolean isSpecial(String charc) {
			// TODO Auto-generated method stub
			if(charc !=null) {
			if(charc.matches("[^A-Za-z0-9]")) 
			return true;
			else
			return false;
			}else {
			return false;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
//         int[] a = {1,0,1,1,0,0,1,0,1};
//        int  count=0;
//         
//       for(int i=0;i<a.length;i++) {
//    	   if(a[i]!=0) {
//    		   a[count++]=a[i];
//    	   }
//       }
//       while(count<a.length) {
//    	   a[count++]=0;
//       }
//         
//         
//       System.out.println(Arrays.toString(a));
//         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
//         int temp=0;
//         int j=0;
//         for(int i=0;i<a.length;i++) {
//        	 if(i==0) {
//        		for(j=i+1;j<a.length;j++) {
//        			if(j==1) {
//        				break;
//        			}
//        		} 
//        		 temp=a[i];
//        		 a[i]=a[j];
//        		 a[j]=temp;
//        	 }
//         }
//         for(int i=0;i<a.length;i++) {
//        	 System.out.print(a[i]+" ");
//         }
         
	//}

	

		
		
//		String s =  "I_ love& my# co{untry";
//		//y_
//		String target="";
//		String[] s2 = s.split("");
//		System.out.println(s2.toString());
//		for(int i=0;i<s2.length;i++) {
//			if(!(isSpecial(s2[i]))) {
//			//
//			}
//			else {
//				
//			}
//		}
//		
//	}

	
	
}
//1,1,1,0,0,1