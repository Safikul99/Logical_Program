package arrays;

import java.util.Scanner;

public class Demo12 
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
		replace(arr);
		System.out.println("Sum of the each element");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
			
		}
		
		
	}
	static void replace(int []arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=calculateDigitSum(arr[i]);
			
		}
	}
	static int calculateDigitSum(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum=sum+(num%10);
			num=num/10;
		}
		return sum;
	}

}
