package demo;


import java.util.Scanner;


public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		boolean res=isStrong(n);
		System.out.println(res);


	}
	static boolean isStrong(int x)
	{
		int sum=0,temp=x;
		do {
			int r=x%10;
			sum=sum+fact(r);
			x=x/10;
		}while(x!=0);
		return sum==temp;

	}
	static int fact(int n)
	{
		int	f=1;
		while(n>1)
		{
			f=f*n;
			n--;
		}
		return f;
	}


}




