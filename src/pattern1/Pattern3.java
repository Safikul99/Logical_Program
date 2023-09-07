package pattern1;

import java.util.Scanner;

public class Pattern3 
{

    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Patten( n);
	}
	static void Patten(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<=num;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}

			System.out.println();
		}
		
		
	}
	static void Patten1(int num)
	{
		for(int i=num;i>=1;i--)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("* ");
			}

			System.out.println();
		}


	}









}
