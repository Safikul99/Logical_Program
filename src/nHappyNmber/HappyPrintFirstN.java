package nHappyNmber;

import java.util.Scanner;

public class HappyPrintFirstN 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;count<n;i++)
		{
			boolean rs=isHappy(i);
			if(rs) 
			{
				System.out.println(i+"");
				count++;
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
////wajp to print first n happy numbers