package nfibonacciSeries;

public class Fib 
{
	public static void main(String[] args) 
	{
		printFib(20);
		
		
	}
	static void printFib(int n)
	{
		int f1=0,f2=1;
		while(f1<=n)
		{
			System.out.println(f1+" "); //0 
			int f3=f1+f2;
			f1=f2;
			f2=f3;
		}
	}

}
//print all the fib with in n