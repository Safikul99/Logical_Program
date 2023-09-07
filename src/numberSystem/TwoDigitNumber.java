package numberSystem;

import java.util.Scanner;

public class TwoDigitNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int  n=sc.nextInt();
		if(n>9&&n<100 || n<-9&&n>-100)
			System.out.println("yes it is a Two digit interger number");
		else
			System.out.println("no it is a Two digit interger number");

	}




}
