package pRightTriangle;

import java.util.Scanner;

public class Number_Incre 
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
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}

}
