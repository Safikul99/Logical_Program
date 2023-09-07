package nfibonacciSeries;

public class fib2 
{


	public static void main(String[] args) 
	{
		int fib=getFib(10);
		System.out.println(fib);
	}
	static int getFib(int n)
	{
		int f1=0,f2=1;
		while(n>1)
		{
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
		return f1;
	}



}
//return the nth fib number