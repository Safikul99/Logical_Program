package day1String;

import java.util.Scanner;

public class Plidrom 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		boolean rs=isPalindrom(str);
		if(rs)
			System.out.println("String is palindero");
		else
			System.out.println("String is not a palindero");

	}
	private static boolean isPalindrom(String str)
	{
//		String rev=new StringBuffer(str).reverse().toString();
//		return str.equals(rev);
		
//		int i=0,j=str.length()-1;
//		while(i<j)
//		{
//			if(str.charAt(i)!=str.charAt(j))
//				return false;
//			i++;
//			j--;
//		}
//		return true;
		
		String rev="";
		for (int i = 0; i <str.length(); i++) //for (int i=str.length();i>=0; i++)
		{
			rev=str.charAt(i)+rev;               //rev=rev+str.charAt(i); 
			
			
		}
	  return str.equals(rev);
	}

}
/* */