package nHappyNmber;

import java.util.Scanner;

public class HappyPrintWith100 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=100;i++)
		{
			boolean rs=isHappy(i);
			if(rs)
			{
				System.out.println(i+"");
			}
		}
	}
	static boolean isHappy(int x)
	{
		while(x>9)
		{
			int sum=0;
			do {
				int d=x%10;
				sum=sum+d*d;
				x=x/10;
			}while(x!=0);
			x=sum;
		}
		return x==1||x==7;
	}

}
////wajp to print all the happy number with in 100