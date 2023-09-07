package day2String;

import java.util.Scanner;

public class CountWord 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		int ct=countWords(str);
		System.out.println("Number of words :"+ct);
	}
	static int countWords(String str)
	{
		int count=0;
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==0&&ch[i]!=' ' || ch[i]!=' '&& ch[i-1]==' ')
				count++;
			
		}
		return count;
	}
}
//how many word presents  in Sentence 