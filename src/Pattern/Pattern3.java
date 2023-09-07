package Pattern;

import java.util.Scanner;

public class Pattern3 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Patten( n);
	}
	static void Patten(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for( int j=1;j<=i;j++)
			{
				System.out.print((char)(i+64)+" "); //changing i to j
			}
			System.out.println();
		}

	}
}
