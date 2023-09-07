package day1String;

import java.util.Scanner;

public class CountVow1 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		String v="AEIOUaeiou";
		int vc=0,cc=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
			{
				if(v.indexOf(ch)>=0)
					vc++;
				else
					cc++; 
			}
		}
		System.out.println("Number of vowle "+vc);
		System.out.println("Number of console "+cc);

	}
}


//write a java program to count the total number of vowels and consonants in a string