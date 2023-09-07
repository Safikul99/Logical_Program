package number;

import java.util.Scanner;

public class Amstron 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Arm(n);
		
	}
	static void Arm(int n)
	{
		int sum=0,r;
		int temp=n;
		while(n>0) 
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
		}
		if(temp==sum)
			System.out.println("Number is Arem");
		else
			System.out.println("Number is not Arem");
		
	}

}
