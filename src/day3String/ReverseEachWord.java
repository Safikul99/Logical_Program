package day3String;

import java.util.Scanner;

public class ReverseEachWord 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		String st=reverWord(str);
		System.out.println(st);

	}
	static String reverWord(String st)
	{
		char ch[]=st.toCharArray();
		String rs="";
		for (int i = 0; i < ch.length; i++) 
		{
			int f=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int l=i-1;
			while(l>=f)
			{
				rs=rs+ch[l];
				l--;
			}
			if(i<ch.length)
				rs=rs+ch[i];
		}
		return rs;
	}

}
////wapt reverse the word in sentance