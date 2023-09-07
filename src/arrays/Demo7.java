package arrays;

import java.util.Scanner;

public class Demo7 
{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the size");
		   int n=sc.nextInt();
		   int []arr=new int[n];
		   System.out.println("Enter: "+n+": value");
		   for(int i=0;i<arr.length;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   int pc=countPrime(arr);
		   System.out.println("Prime: "+pc);
		
	}
	static int  countPrime (int []x)
	{
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			boolean rs=isPrime(x[i]);
					if(rs)
				count++;
		}
		return count;
	}
	static boolean isPrime(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
