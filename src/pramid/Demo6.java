package pramid;

import java.util.Scanner;

public class Demo6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		Star(n);
	}
	public static void Star(int n)
	{

		for (int i=1; i<=n; i++) 
		{
			for (int j=1;j<=n;j++) 
			{
				if(i==1||j==1||i==n ||j==n|| j==i || i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
