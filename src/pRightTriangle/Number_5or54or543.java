package pRightTriangle;

import java.util.Scanner;

public class Number_5or54or543 
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
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
