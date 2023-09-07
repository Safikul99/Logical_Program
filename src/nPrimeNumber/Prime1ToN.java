package nPrimeNumber;

import java.util.Scanner;

public class Prime1ToN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Prime numbers between 1 and "+n);
		for(int i=2;i<=n;i++)
		{
			boolean res=isPrime(i);
			if(res)
				System.out.print(i+" ");
		}


	}
	static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

}
//Write a program to display PRIME NUMBERS from 1 to n?