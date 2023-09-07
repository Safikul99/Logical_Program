package mixNumber;

import java.util.Scanner;

public class Palindrom 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		boolean rs=isPalindrom(n);
		if(rs)
			System.out.println(n+" is a palindrom");
		else
			System.out.println(n+" is not a palindrom");

	}
	static boolean isPalindrom(int x)
	{
		int temp=x,rev=0;
		do {
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
			
		}while(x!=0);
      return rev==temp;
	}

}
