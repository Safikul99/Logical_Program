package numberConversion;

import java.util.Scanner;

public class DecimalToHEX1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal Number: ");
		int n=sc.nextInt();
		String rs=toHEX(n);
		System.out.println("HEX number is:"+rs);
		
	}
	static String toHEX(int dec)
	{
		String hex="";
		do {
			int r=dec%16;
			if(r<10)
				hex=r+hex;
			else if(r==10)
				hex='A'+hex;
			else if(r==11)
				hex='B'+hex;
			else if(r==12)
				hex='C'+hex;
			else if(r==13)
				hex='D'+hex;
			else if(r==14)
				hex='E'+hex;
			else if(r==15)
				hex='F'+hex;
			dec=dec/16;
			
		}while(dec!=0);
		return hex;
	}

}
