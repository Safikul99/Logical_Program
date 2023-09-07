package numberConversion;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Patten( n);
		
		
	}
	static void Patten(int num)
	{
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=num-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
