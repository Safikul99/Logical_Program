package number2;

import java.util.Scanner;

public class Big 
{ 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nimber:");
		int n=sc.nextInt();
		int big=-9;
		do {
			int d=n%10;
			if(d>big)
				big=d;
			n=n/10;
		}while(n!=0);
		System.out.println("Bigest Digit is:"+big);
			
				
		
	}

}
