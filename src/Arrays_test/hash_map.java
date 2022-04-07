package Arrays_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String,Integer> hp = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hp.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            
            	if(hp.containsKey(s)) {
            		System.out.println(s+"="+hp.get(s));
            	}else {
            		System.out.println("Not Found");
            	}
            		
            
        }
        in.close();
    }

}