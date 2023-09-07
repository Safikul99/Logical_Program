package Newquesction;

import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		patter(n);

	}
	static void patter(int n)
	{
		int x=n;
		int y=n;
		for (int i = 1; i <=n; i++) 
		{
			for (int j = 1; j <n*2; j++) 
			{
				if(j<=x)
				{
					System.out.print(j+" ");
				}
				else if(j>=y)
					System.out.print(n*2-j+" ");
				else
				{
					System.out.print("  ");
				}

			}

			System.out.println();
			x--;
			y++;
		}

	}

}
