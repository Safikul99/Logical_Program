package nfibonacciSeries;

public class FinFirstN 
{

	public static void main(String[] args) 
	{
		printFib(10);
	}
	static void printFib(int n)
	{
		int f1=0,f2=1;
		while(n>0)
		{
			System.out.println(f1+" "); //0 
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
	}

}
