package numberConversion;

import java.util.Scanner;

public class DecimalToOctal1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal Number: ");
		int n=sc.nextInt();
		String rs=toOctal(n);
		System.out.println("Octal number is: "+rs);
		
	}
	static String toOctal(int dec)
	{
		String oct="";
		do {
			int r=dec%8;
			oct=r+oct;
			dec=dec/8;
		}while(dec!=0);
		return oct;
	}

}
