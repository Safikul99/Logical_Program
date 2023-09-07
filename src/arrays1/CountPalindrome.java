package arrays1;

import java.util.Scanner;

public class CountPalindrome 
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
		   int pc=countPalin(arr);
		   System.out.println("palindrom: "+pc);
		
	}
	static int countPalin(int[] x )
	{
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			boolean rs=isPalindrom(x[i]);
			if(rs)
				count++;
		}
		return count;
	}
	static boolean isPalindrom(int x)
	{
		int temp=x,rev=0;
		do {
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
			
		}while(x!=0);
      return rev==temp;
	}



}
