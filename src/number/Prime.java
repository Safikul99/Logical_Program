package number;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numebr:");
		int num=sc.nextInt();
		prime(num);


	}
	public static void prime(int num)
	{
		if(num>1)
		{
			int count =0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Number is prime");
			}
			else
			{
				System.out.println("Number is not prime");
			}
		}
		else
		{
			System.out.println("number is not prime");
		}

	}

}
