package day5string1;

import java.util.Scanner;

public class CountWord 
{
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the main string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the  Substring: ");
		String s2 = sc.nextLine();
		int rs = iscountWord(s1, s2);
		System.out.println(rs+"times it is present");
	}

	 static int iscountWord(String s1, String s2) {
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		int count=0;
		for (int i = 0; i < s1.length(); i++) {
			int f = i, j = 0;
			while (f < ch1.length && j < ch2.length && ch1[f] == ch2[j]) {
				f++;
				j++;

			}
			if (j == ch2.length) {
				if ((i == 0 || ch1[i - 1] == ' ') && (f == ch1.length || ch1[f] == ' '))
					i=f-1;
					count++;
			}

		}
		return count;
	}



}
