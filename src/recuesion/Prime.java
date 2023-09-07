package recuesion;

public class Prime 
{
	public static void main(String[] args) 
    {
   	boolean res=isPrime(17);
   	 System.out.println(res);
		
	}
	public static   boolean   isPrime(int n)
	 {
		 return isPrime(2,n);
	 }
    public static boolean isPrime(int i,int n)
    {
    	if(n%i==0)
    		return false;
    	if(i>n/2)
    		return true;
    	return isPrime(i+1,n);
    	
    }
}
