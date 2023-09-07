package day4;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{

		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String str=sc.nextLine();
	     boolean rs=printFrequency(str);
	     if(rs)
	    	 System.out.println("String is a panagram");
	     else
	    	 System.out.println("String is a not panagram");
	}

	static boolean printFrequency(String str) 
	{
		int []count=new int[26];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count[ch-97]++;
			
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0)
				return false;
		}
		return true;

	}

}
