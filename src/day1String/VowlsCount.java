package day1String;

import java.util.Scanner;

public class VowlsCount 
{

	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		int vc=0;
		for (int index= 0; index< str.length(); index++) 
		{
			char ch=str.charAt(index);

			if(ch=='A'||ch=='E'|| ch== 'I'||ch== 'O'||ch=='U'||ch=='a'||ch=='e'|| ch== 'i'||ch== 'o'||ch=='u')
				vc++;

		}
		System.out.println("Number of vowle "+vc);
	}
}
//write a java program to print how many vowel present in the String