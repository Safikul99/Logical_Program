package numberSystem;

import java.util.Scanner;

public class Month 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int  m=sc.nextInt();
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
			System.out.println("31 days");
		else if(m==4||m==6||m==9||m==11)
			System.out.println("30 days");
		else if(m==2)
			System.out.println("28 or 29 days");
		else
			System.out.println("invalid");


	}

}
