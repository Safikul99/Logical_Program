package arrays;

import java.util.Scanner;

public class Demo13 
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
		int diff=calculateEvenOddSumDifference(arr);

	}
	static int calculateEvenOddSumDifference(int []num)
	{
		int evenSum=0,oddSum=0;
		for (int i = 0; i < num.length; i++) 
		{
			if(num[i]%2==0)
				evenSum+=num[i];
			else
				oddSum+=num[i];

		}
		return evenSum-oddSum;
	}




}
