package day4;

import java.util.Scanner;

public class printFrequencyAlph 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		printFrequencyAlph(str);


	}
	static void printFrequencyAlph(String str)
	{
		int [] ct=new int[26];
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				ct[ch-65]++;
			else if(ch>='a'&&ch<='z')
				ct[ch-97]++;



		}
		for (int i = 0; i <ct.length; i++) //for (int i = 0; i <26; i++) 
		{
			if(ct[i]!=0)
				System.out.println((char)(i+65)+"---> "+ct[i]);

		}
	}
}
