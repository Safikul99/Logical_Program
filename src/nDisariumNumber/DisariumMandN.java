package nDisariumNumber;

import java.util.Scanner;

public class DisariumMandN 
{


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the M and N:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int count=0;
		for(int i=m;i<n;i++)
		{
			boolean rs=isDiserium(i);
			if(rs)
				System.out.println(i+" ");
				count++;
		}
		System.out.println(count);
		
		

	}
	static boolean isDiserium(int x)
	{
		int sum=0, temp=x;
		int dc=countDigit(x);
		do {
			int d=x%10;
			sum=sum+pow(d,dc);
			dc--;
			x=x/10;
		}while(x!=0);
		//		if(sum==temp)
		//			return true;
		//		else
		//			return false;
		return sum==temp;
	}
	static int countDigit(int n)
	{
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	static int pow(int n,int p)
	{
		int prod=1;
		while(p>0)
		{
			prod=prod*n;
			p--;
		}
		return prod;
	}









}
