package day4;

import java.util.Scanner;

public class Pangram 
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
		int [] ct=new int[26];
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				ct[ch-65]++;
			else if(ch>='a'&&ch<='z')
				ct[ch-97]++;


		}
		for (int i = 0; i <26; i++) 
		{
			if(ct[i]==0)
				return false;
		}
		return true;
	}

}
//write a java program to check whether a given string is pangram or not