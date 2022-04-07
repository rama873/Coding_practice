package Arrays_test;

class Calculator{
	
	public static void main(String[] args) {
		power(5,6);
	}
    public static int power(int n, int p){
        double result = 0;

        try{
        	if(n > 0 && p>0 ) {
            result =Math.pow(n, p);
        	}else {
        		 throw new MyException("Number is positive");
        	}
        }catch(MyException e){
            System.out.println(e);
        }
        return (int) result;
    }
    
}

class MyException extends Exception
{
 public MyException(String str)
 {
  System.out.println(str);
 }
}