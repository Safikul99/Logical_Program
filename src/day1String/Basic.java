package day1String;

import java.util.Scanner;

public class Basic 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		System.out.println("numner of charcters: "+str.length());
		System.out.println("first  charcters: "+str.charAt(0));
		System.out.println("Last  charcters: "+str.charAt(str.length()-1));
		
		
		System.out.println("a perent at index: "+str.indexOf('a'));
		
		
		
	}

}
