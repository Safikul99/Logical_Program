package number;

import java.util.Iterator;
import java.util.Scanner;

public class Fer 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enten the number");
		int n=sc.nextInt();
		fra(n);
		
	}
	static void fra(int n)
	{
		int a=0;
		int b=1;
	
		System.out.print(a+" "+b);
		for (int i = 1; i < n-2; i++) 
		{
			int sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
			
		}
		
	}

}
