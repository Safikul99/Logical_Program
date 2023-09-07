package nStrongNumber;

import java.util.Scanner;

public class StrongFirst2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N:");
		int n=sc.nextInt();
		for(int i=1;n>0;i++)
		{
			boolean rs=isStrong(i);
			if(rs)
				System.out.println(i+" ");
				n--;
		}
		
		
	}
	static boolean isStrong(int x)
	{
		int sum=0, temp=x;
		do {
			int d=x%10;
			sum=sum+fact(d);
			x=x/10;
		}while(x!=0);
		//		if(sum==temp)
		//			return true;
		//		else
		//			return false;
		return sum==temp;
	}
	static int fact(int d)
	{
		int fact=1;
		while(d>1)
		{
			fact=fact*d;
			d--;
		}
		return fact;
	}







}