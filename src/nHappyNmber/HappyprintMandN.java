package nHappyNmber;

import java.util.Scanner;

public class HappyprintMandN 
{


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number M and N:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			boolean rs=isHappy(i);
			if(rs)
				System.out.println(i+"");
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
////wajp to print all the happy numbers between m and n