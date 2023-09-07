package day1String;

import java.util.Scanner;

public class countVow 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		int vc=0,cc=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				if(ch=='A'||ch=='E'|| ch== 'I'||ch== 'O'||ch=='U')
					vc++;
				else
					cc++; 
			}
			else if(ch>='a'&&ch<='z')
			{
				if(ch=='a'||ch=='e'|| ch== 'i'||ch== 'o'||ch=='u')
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
			



