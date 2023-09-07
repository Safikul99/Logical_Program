package day5string1;

import java.util.Scanner;

public class ReplaceAll 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the main string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the  Substring: ");
		String s2 = sc.nextLine();
		System.out.println("Enter the  replaceing String : ");
		String s3 = sc.nextLine();
		String res=replaceAll(s1, s2,s3);
		System.out.println(res);
	}

	static String replaceAll(String s1, String s2,String rs) 
	{
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		String str="";
		for (int i = 0; i < ch1.length; i++) 
		{
			int f = i, j = 0;
			while (f < ch1.length && j < ch2.length && ch1[f] == ch2[j]) 
			{
				f++;
				j++;

			}
			if (j == ch2.length) {
				if ((i == 0 || ch1[i - 1] == ' ') && (f == ch1.length || ch1[f] == ' '))
				{
					str=str+rs;
					i=f-1;
					continue;
				}


			}
			str=str+ch1[i];

		}
		return str;
	}

}
