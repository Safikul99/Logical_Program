package numberSystem1;

import java.util.Scanner;

public class ThreeDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int  n=sc.nextInt();
		
		if(n>99&&n<1000||n>-1000&&n<-99)
			System.out.println("yes number is three Digit");
		else
			System.out.println("not number is three Digit");
			
		
	}
	
	

}
