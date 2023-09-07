package day4;

import java.util.Scanner;

public class Frequency 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String str=sc.nextLine();
		printFrequency(str);


	}
	static void printFrequency(String str)
	{
		int [] ct=new int[128];
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			ct[ch]++;

		}
		for (int i = 0; i<ct.length; i++) // or for (int i = 0; i < 128; i++) 
		{
			if(ct[i]!=0)
				System.out.println((char)i+"---> "+ct[i]);

		}
	}
}
//Java program to check frequency of characters in a string