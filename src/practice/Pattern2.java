package practice;

import java.util.Scanner;

public class Pattern2 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Patten( n);
		
		
	}
	static void Patten(int num)
	{
		for(int i=num;i>=1;i--)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}



}
