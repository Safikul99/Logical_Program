package numberSystem1;

import java.util.Scanner;

public class Markes 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(a<35||b<35||c<35||d<35)
			System.out.println("fail");
		else 
		{
			double per=(a+b+c+d)/4.0;
			if(per>=85)
				System.out.println("Distinction");
			else if(per>=60)
				System.out.println("First class");
			else if(per>=50)
				System.out.println("Second class");
			else
				System.out.println("pass");

		}

	}



}
