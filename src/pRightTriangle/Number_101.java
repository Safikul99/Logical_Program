package pRightTriangle;

import java.util.Scanner;

public class Number_101 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		pattern(n);
		
	}
	static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((i%2)+" ");
			}
			System.out.println();
		}
	}

}

/**
1 
0 0 
1 1 1 
0 0 0 0 
1 1 1 1 1 

*/