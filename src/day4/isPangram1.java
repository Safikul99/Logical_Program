package day4;

import java.util.Scanner;

public class isPangram1 
{

	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		boolean rs=isPangram(str);
		if(rs)
			System.out.println("String is pangram");
		else
			System.out.println("String is not pangram");

	}
	static boolean isPangram(String str)
	{
		if(str.length()<26)
			return false;
		str=str.toLowerCase();
		for (char ch='a';ch<='z';ch++) 
		{
			if(str.indexOf(ch)==-1)
			return false;

		}
		return true;
	}



}
