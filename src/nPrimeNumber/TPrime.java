package nPrimeNumber;

import java.util.Scanner;

public class TPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nimber:");
		int n=sc.nextInt();
		boolean res=isPrime(n);
		if(res==true)
		System.out.println(n+"is a prime Number");
		else
		System.out.println(n+"is not a prime Number");

	}
   static boolean isPrime(int n)
   {
	  
	   for(int i=2;i<=n/2;i++)
	   {
		   if(n%i==0)
			  return false;
		   
	   }
	   return true;
	
   }

}
