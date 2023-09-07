package nPerfect;

import java.util.Scanner;

public class PerfactMandN 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the M and N:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			boolean res=isPerfact(i);
			if(res)
			{
				System.out.print(i+" ");
				
			}
				
		}

	}
	static boolean isPerfact(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum==n;

	}





}
