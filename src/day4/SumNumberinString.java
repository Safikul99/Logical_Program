package day4;

import java.util.Scanner;

public class SumNumberinString 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter the Sentence");//sa20gff30
		String str=sc.nextLine();
		int s=sumOfDigit(str);
		System.out.println(s);

	}

	static int sumOfDigit(String str) 
	{
		int sum=0;
		for (int i = 0; i <str.length(); i++) 
		{
			int n=0;
			char ch=str.charAt(i);
			while(ch>='0'&&ch<='9')
			{
				n=n*10+(ch-48);
				i++;
				if(i==str.length())
					break;
				ch=str.charAt(i);
			}
			sum=sum+n;
		}
		return sum;
	}

}
