package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 
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
		str1=str1.replaceAll(" ","");//removes space from string
		str2=str2.replaceAll(" ","");
		if(str1.length()!=str2.length()) //checks the length of both the string are equal or not
			return false;
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();  
		char c1[]=str1.toCharArray();//string are group of string
		char c2[]=str2.toCharArray();//char are group of character
		Arrays.sort(c1);
		Arrays.sort(c2);
		str1=new String(c1);//
		str2=new String(c2);//
		return str1.equals(str2);// Arrays.equals(c1,c2); str1 and str2 not necssary direct use
	}
}
////write a program to String are anagram are not