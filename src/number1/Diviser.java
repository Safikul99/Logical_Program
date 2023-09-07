 package number1;

import java.util.Scanner;

public class Diviser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
//		int sum=0;
//		for(int i=1;i<=n;i++)
//		{
//			if(n%i==0)
//			sum=sum+i;
//		}
		int sum=n;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			sum=sum+i;
		}
		System.out.println("sum of divisore: "+sum);
		
	}

}
