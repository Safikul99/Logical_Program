package numberSystem1;

import java.util.Scanner;

public class Midvalue 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three integer values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a<c||a>c&&a<b)
			System.out.println(a+" is the Middle value");
		else if (b>a&&b<c||b>c&&b<a)
			System.out.println(b+" is the Middle value");
		else
			System.out.println(c+" is the Middle value");

	}

}
