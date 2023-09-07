package numberConversion;

import java.util.Scanner;

public class DecimalToBinary 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		String s=toBinary( n);
		System.out.println("Binary number is:"+s);
		
	}
	static String toBinary(int num)
	{
		String st="";
		while(num!=0)
		{
			int d=num%2;
			st=d+st;
			num=num/2;
			
		}
		return st;
	}

}
