package day3String;

import java.util.Scanner;

public class VowUppandConLow 
{
	public static void main(String[] args) 
	{

		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		String st=vowUpper(str);
		
	}
	static String vowUpper(String str)
	{
		char ch[]=str.toCharArray();
		for (int i = 0; i < str.length(); i++) 
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				ch[i]=(char)(ch[i]-32);
			else
			{
				
			}
				
		}
		return new String(ch);
	}
			

}
//define a method to convert all the vowel in string to upper case and consonant to lower case