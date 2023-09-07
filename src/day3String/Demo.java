package day3String;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		String st=reverWord(str);  //  r a m a  _ i s _ g o o d _ b o y
		System.out.println(st);      //0 1 2 3 4  5 6 7 8 9 101112131415 

	}
	static String reverWord(String st)
	{
		String s="";
		char []ch=st.toCharArray();
		for (int i = 0; i<ch.length; i++) 
		{
			int f=i;//0
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int l=i-1;
			while(l>=f)
			{
				s=s+ch[l];
				l--;
			}
			if(i<ch.length)
				s=s+ch[i];
			
		}
		return s;
	}
	
	

}
