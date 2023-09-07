package numberSystem;

import java.util.Scanner;

public class InteOrDigit 
{

	static void num(int n)
	{
		if(n>=-9&&n<=9)
			System.out.println(n+" is a digit");
		else
			System.out.println(n+" is a number");

	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int  n=sc.nextInt();
		num(n);

	}



}
