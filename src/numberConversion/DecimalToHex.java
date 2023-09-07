package numberConversion;

import java.util.Scanner;

public class DecimalToHex 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		String str=toHex(n);
		System.out.println("Hex number is:"+str);
	}
	static String toHex(int n)
	{
		String st="";
		while(n!=0)
		{
			int num=n%16;
			if(num<=9)
				st=num+st;
			else if(num==10)
				st='A'+st;
			else if(num==11)
				st='B'+st;
			else if(num==12)
				st='C'+st;
			else if(num==13)
				st='D'+st;
			else if(num==14)
				st='E'+st;
			else if(num==15)
				st='F'+st;
			n=n/16;
		}
		return st;
	}

}
