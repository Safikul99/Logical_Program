package nPerfect;

import java.util.Scanner;

public class PerfectWithN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			boolean res=isPerfact(i);
			if(res)
			{
				count++;
				System.out.println(i+" ");
			}
				
		}
		//System.out.println(count+" ");

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
