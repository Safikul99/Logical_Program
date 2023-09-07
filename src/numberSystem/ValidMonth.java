package numberSystem;

import java.util.Scanner;

public class ValidMonth 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int  m=sc.nextInt();
		if(m>=1&&m<=12)
			System.out.println("valid month number");
		else
			System.out.println("invalid month number");

	}

}
