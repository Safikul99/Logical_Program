package day2String;

import java.util.Scanner;

public class SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");
		String str=sc.nextLine();
		int sum=sumofDigit(str);
		System.out.println("sum of digits:"+sum);
		
	}
	static int sumofDigit(String str)
	{
		int sum=0;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='9')
				sum=sum+ch-48;
		}
		return sum;
	}

}
