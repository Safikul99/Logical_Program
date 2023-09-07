package number2;

import java.util.Scanner;

public class Smal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nimber:");
		int n=sc.nextInt();
		int small=9;
		do {
			int d=n%10;
			if(d<small)
				small=d;
			n=n/10;
		}while(n!=0);
		System.out.println("Bigest Digit is:"+small);
			
				
		
	}

}
