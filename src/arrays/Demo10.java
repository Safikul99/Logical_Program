package arrays;

import java.util.Scanner;

public class Demo10 
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
		
		double average=calAvg(arr);
		System.out.println("Average"+average);
		
		
	}
	static double calAvg(int [] arr)
	{
		double sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum=sum+arr[i];
		}
		return  sum/arr.length;
	}

}
