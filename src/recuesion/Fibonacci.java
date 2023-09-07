package recuesion;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int res=fib(3);
	System.out.println(res);
		
	}
	static int fib(int n)
	{
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return fib(n-1)+fib(n-2);
	}

}
