package numberSystem;

import java.util.Scanner;

public class ArrayEvenorOdd 
{

	static void num(int n)
	{
		String[] st= {"even","odd"};
		System.out.println(n+" is an "+st[n%2]+" number");

	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int  n=sc.nextInt();
		num(n);
		sc.close();

	}



}
