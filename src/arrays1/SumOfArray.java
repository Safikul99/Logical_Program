package arrays1;

import java.util.Scanner;

public class SumOfArray 
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
		
		int res=calSum(arr);
		System.out.println("sum: "+res);
		
		
	}
	static int calSum(int [] arr)
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum=sum+arr[i];
		}
		return  sum;
	}



}
