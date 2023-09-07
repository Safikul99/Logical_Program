package day2String;

import java.util.Scanner;

public class FirstLeterCapatial 
{
	public static void main(String[] args) 
	{

		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");     // c h i t r a d u r g a _ is _ a _f o r t _c i t y
		String str=sc.nextLine();                     // 0 1 2 3 4 5 6 7 8 9101112 1314151617181920212223
		String st=firstWord(str);//                // _ _ c h i t r a d u r g a _ is _ a _f o r t _c i t y
		System.out.println(""+st);                 // 0 1 2 3 4 5 6 7 8 9101112 13141516171819202122232425

	}
	static String firstWord(String str)
	{
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==0&&ch[i]!=' ' || ch[i]!=' '&& ch[i-1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else {
				if(ch[i]>='A'&&ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
			}

		}//st=new String(ch)
		//return st;
		return new String(ch);
	}

}
//define a method to convert every word first 
//initcaps