package number1;

import java.util.Scanner;

public class Count 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int count=0;
		do 
		{
			count++;
			n=n/10;

		}while(n!=0);
		System.out.println("Number is digit:"+count);

	}

}
