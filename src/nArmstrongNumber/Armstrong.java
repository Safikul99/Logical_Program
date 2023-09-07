package nArmstrongNumber;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=sc.nextInt();
		boolean rs=isArmstrong(n);
		if(rs)
			System.out.println(n+" is a  Armstrong");
		else
			System.out.println(n+" is a not Armstrong");
		
	}
	static boolean isArmstrong(int x)
	{
		int sum=0, temp=x;
		int dc=countDigit(x);
		do {
			int d=x%10;
			sum=sum+fact(x,dc);
			x=x/10;
		}while(x!=0);
//		if(sum==temp)
//			return true;
//		else
//			return false;
		return sum==temp;
	}
	static int countDigit(int n)
	{
		int count=0;
		do {
			n=n/10;
			count++;
		}while(n!=0);
		return count;
	}
	static int fact(int n,int p)
	{
		int fact=1;
		while(p>1)
		{
			fact=fact*n;
			p--;
		}
		return fact;
	}



}
