package nPrimeNumber;

import java.util.Scanner;

public class PrimeFirst 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the of n:");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;count<n ;i++)
		{
			boolean rs=isPrime(i);
			if(rs)
			{
				System.out.print(i+" ");
				count++;
			}

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
