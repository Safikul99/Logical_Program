package day4;

import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		boolean rs=isAnagram(str1,str2);
		if(rs)
			System.out.println("String is Aangram");
		else
			System.out.println("String is not Aangram");
	}
	static boolean isAnagram(String str1,String str2)
	{
		int [] ct1=new int[26];
		for (int i = 0; i < str1.length(); i++) 
		{
			char ch=str1.charAt(i);
			if(ch>='A'&&ch<='Z')
				ct1[ch-65]++;
			else if(ch>='a'&&ch<='z')
				ct1[ch-97]++;
		}
		int [] ct2=new int[26];
		for (int i = 0; i < str2.length(); i++) 
		{
			char ch=str2.charAt(i);
			if(ch>='A'&&ch<='Z')
				ct2[ch-65]++;
			else if(ch>='a'&&ch<='z')
				ct2[ch-97]++;
		}
		for (int i = 0; i<26; i++) 
		{
			if(ct1[i]!=ct2[i])
				return false;
		}
		return true;
	}
}




//write a program to String are anagram are not
