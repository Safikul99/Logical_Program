package numberSystem;

import java.util.Scanner;

public class Switc 
{

	static void num(int n)
	{
		switch(n%2)
		{
		case 0:System.out.println("n is even:"+n);
		       break;
		case 1:System.out.println("n is odd:"+n);
		 break;
		
		}

	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int  n=sc.nextInt();
		num(n);

	}



}
