package day1String;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		int re=countWord(str);
        System.out.println(re);
	}
	static int countWord(String s)
	{
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i]==' ')
				count++;
		}
		return count;
	}
	
}
