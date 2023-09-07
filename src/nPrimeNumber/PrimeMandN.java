 package nPrimeNumber;

import java.util.Scanner;

public class PrimeMandN 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the of m and n:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			boolean rs=isPrime(i);
			if(rs)
				System.out.print(i+" ");

		}

	}
	static boolean isPrime(int x)
	{

		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
				return false;

		}
		return true;

	}

}
