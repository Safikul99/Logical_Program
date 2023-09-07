package arrays;

import java.util.Scanner;

public class Demo11 
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
		
		countNumber(arr);
	}
	static void countNumber(int []num)
	{
		int countEven=0,countOdd=0;
		for (int i = 0; i < num.length; i++) 
		{
			if(num[i]%2==0)
				countEven+=1;
			else
				countOdd+=1;
				
			
		}
		System.out.println("Even Elements count : "+ countEven);
	     System.out.println("Odd Elements count : "+ countOdd);
	}

}
