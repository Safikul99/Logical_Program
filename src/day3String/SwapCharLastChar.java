package day3String;

import java.util.Scanner;

public class SwapCharLastChar 
{
	public static void main(String[] args) 
	{

		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		String s=swapFL(str);
		System.out.println(s);
	}
	static String swapFL(String s)
	{
		char ch[]=s.toCharArray();
		int f=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				f=i;
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				char temp=ch[f];
				ch[f]=ch[i];
				ch[i]=temp;
			}

		}
		return new String(ch);
	}
}
//every word last swap first char and first char swap last
//swap evary word first chater which the same word last chater
