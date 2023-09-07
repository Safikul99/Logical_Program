package numberSystem;

import java.util.Scanner;

public class EvenOrOdd 
{
	static void num(int n)
	{
		if(n/2*2==n)
			System.out.println("N is even:"+n);
		else
			System.out.println("N is odd:"+n);

	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int  n=sc.nextInt();
		num(n);

	}

}
