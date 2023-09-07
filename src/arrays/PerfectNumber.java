package arrays;

import java.util.Scanner;

public class PerfectNumber 
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
		
		int c=0;
		for (int i = 0; i < arr.length; i++) 
		{
			boolean rs=isPerct(arr[i]);
			if(rs)
				c++;
			
		}
		System.out.println("Count number"+c);
	}
	static boolean isPerct(int n)
	{
		int sum=0;
		for (int i =1; i< n/2; i++) 
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			
		}
		return sum==n;
	}

}
