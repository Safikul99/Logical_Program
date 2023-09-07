package day2String;

import java.util.Scanner;

public class CountDigits 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		int c=countofDigit(str);
		System.out.println("count of digits:"+c);
		
	}
	static int countofDigit(String str)
	{
		int count=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
				count++;
		}
		return count;
	}

}
////define a method to return how many digits presents 