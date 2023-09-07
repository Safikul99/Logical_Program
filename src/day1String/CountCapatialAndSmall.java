package day1String;

import java.util.Scanner;

public class CountCapatialAndSmall 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		int uc=0,lc=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90)
				uc++;
			else if(ch>=97&&ch<=122)
				lc++;
		}
		System.out.println("Number of capital letters: "+uc);
		System.out.println("Number of capital letters: "+lc);
	}

}
//write a java program to how many small letter and capital letter present in String