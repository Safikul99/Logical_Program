package nPrimeNumber;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nimber:");
		int n=sc.nextInt();
		int count=0;
		do {
			int d=n%10;
			if(d==2||d==3||d==5||d==7)
				count++;

			n=n/10;
		}while(n!=0);
		System.out.println("Number of prime digits: "+count);

	}

}
