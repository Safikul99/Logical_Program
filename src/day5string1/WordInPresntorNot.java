package day5string1;

import java.util.Scanner;

public class WordInPresntorNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the main string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the  Substring: ");
		String s2 = sc.nextLine();
		boolean rs = isWord(s1, s2);
		if (rs)
			System.out.println(s2 + " is the word in the " + s1);
		else
			System.out.println(s2 + " is not the word in the " + s1);

	}

	private static boolean isWord(String s1, String s2) {
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			int f = i, j = 0;
			while (f < ch1.length && j < ch2.length && ch1[f] == ch2[j]) {
				f++;
				j++;

			}
			if (j == ch2.length) {
				if ((i == 0 || ch1[i - 1] == ' ') && (f == ch1.length || ch1[f] == ' '))
					return true;
			}

		}
		return false;
	}

}
