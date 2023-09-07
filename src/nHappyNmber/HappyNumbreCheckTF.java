package nHappyNmber;

import java.util.Scanner;

public class HappyNumbreCheckTF 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		boolean rs=isHappy(n);
		if(rs)
			System.out.println(n+" is a happy number");
		else
			System.out.println(n+" is not a happy number");
			
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
//define a method to return true if the number is happy number otherwise return false;



