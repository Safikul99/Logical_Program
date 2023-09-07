package numberConversion;

import java.util.Scanner;

public class DEcimalToBinary1 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Decimal Number: ");
	int n=sc.nextInt();
	String rs=toBinary(n);
	System.out.println("Binary number is: "+rs);
		
	}
	static String toBinary(int dec)
	{
		String bin="";
		do {
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
		}while(dec!=0);
		return bin;
	}

}
