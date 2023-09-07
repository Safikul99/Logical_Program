package day4;

import java.util.Scanner;

public class ConverNumToSen 
{
	public static void main(String[] args) 
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		int n=sc.nextInt();
		nw(n/10000000,"crote");
		
	}

	 static void nw(int i, String string) 
	{
		String[] fs= {"","one","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
				"Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"
		};
		
		
	}

}
//wajpt convert the number to sentance 