package number1;

import java.util.Scanner;

public class SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=0;
		do 
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;


		}while(n!=0);
		System.out.println("Number is digit:"+sum);

	}

}
