package nPrimeNumber;

import java.util.Scanner;

public class PrimeFirst2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the of n:");
		int n=sc.nextInt();

		for(int i=2;n>0;i++)
		{
			boolean rs=isPrime(i);
			if(rs)
			{
				System.out.print(i+" ");
				n--;	
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
