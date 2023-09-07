package Newquesction;

import java.util.Scanner;

public class Patt 
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
		int sp=n-1,st=1;
		
		for (int i = 1; i <n*2; i++) 
		{
			for (int j = 1; j <=sp; j++) 
			{
			System.out.print("  ");	
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print(j+" ");
			}
			if(i<n)
			{
				sp--;
				st++;
			}
			else
			{
				sp++;
				st--;
			}
			System.out.println();
			
		}

	}


}
