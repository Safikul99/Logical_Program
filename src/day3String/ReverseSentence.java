package day3String;

import java.util.Scanner;

public class ReverseSentence 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		String s=reverSen(str);
		System.out.println(s);

	}
	static String reverSen(String st)
	{

		char ch[]=st.toCharArray();
		String rs="";
		for (int i =ch.length-1; i>=0; i--) 
		{
			int l=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int f=i+1;
			while(f<=l)
			{
				rs=rs+ch[f];
				f++;
			}
			if(i>=0)
				rs=rs+ch[i];

		}
		return rs;



	}

}
