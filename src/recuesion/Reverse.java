package recuesion;

public class Reverse 
{
     public static void main(String[] args) 
     {
    	 int num=82354;
    	 System.out.println(reverse(num));
    	 
    			 
		
	}
     static int reverse(int n)
     {
    	 return reverse(0,n);
     }
     static int reverse(int rev,int n)
     {
    	 if(n==0)
    		 return rev;
    	 return reverse(rev*10+n%10,n/10);
     }
}
