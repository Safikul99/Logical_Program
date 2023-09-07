package arrays;

import java.util.Scanner;

public class Demo9 
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
		System.out.println("User Enter array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int num=countPerfectNumbers(arr);
		System.out.println("count number is:"+num);

	}
	static int countPerfectNumbers(int []x)
	{
		int count=0;
		for (int num:x) 
		{
			if(isPerfectNumber(num))
				count++;
				
		}
		return count;
	}
	static boolean isPerfectNumber(int num)
	{
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return sum==num;
	}
	

}
