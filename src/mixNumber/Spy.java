package mixNumber;

import java.util.Scanner;

public class Spy 
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		boolean rs=isSpy(n);
		if(rs)
			System.out.println(n+" is a isSpy");
		else
			System.out.println(n+" is not a isSpy");
		
	}
	static boolean isSpy(int x)
	{
		int sum=0,prod=1;
		do {
			int d=x%10;
			sum=sum+d;
			prod=prod*d;
			
			
			x=x/10;
		}while(x!=0);
		
		return sum==prod;
	}
	

}
