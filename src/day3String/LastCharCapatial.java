package day3String;

import java.util.Scanner;

public class LastCharCapatial 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		String ss=LastCharCapatail(str);
		System.out.println(ss);
		
	}
	static String LastCharCapatail(String st)
	{
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==ch.length-1&&ch[i]!=' ' || ch[i]!=' '&& ch[i+1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else {
				if(ch[i]>='A'&&ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
			}
			
		}
		return new String(ch);
	}

}
//last charater capatial and remaing charter small