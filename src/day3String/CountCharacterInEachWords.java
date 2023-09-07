package day3String;

import java.util.Scanner;

public class CountCharacterInEachWords 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		count(str);

	}
	static void count(String st)
	{
		char[] ch=st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
          String s="";
          while(i<ch.length &&ch[i]!=' ')
          {
        	  s=s+ch[i];
        	  i++;
          }
         System.out.println(s+" ->"+s.length());
 
		}
	}
}
//Java program to count the characters in each word in a given sentence