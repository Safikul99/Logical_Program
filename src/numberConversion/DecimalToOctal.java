package numberConversion;

import java.util.Scanner;

public class DecimalToOctal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Octal number:");
		int n=sc.nextInt();
		String str=toOctal(n);
		System.out.println("Octal number is:"+str);
		
		
	}
	static String toOctal(int num)
	{
		String st="";
		while(num!=0)
		{
			int d=num%8;
			st=d+st;
		    num=num/8;
		}
		return st;
	}

}
