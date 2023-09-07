package pReverseRightTriangle;

import java.util.Scanner;

public class Number_12345or1234 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		pattern(n);
		
	}
	static void pattern(int n)
	{
		for(int i=1;i<=n;i++)                   //for(int i=n;i>=1;i--)
		{                                        //{
			for(int j=1;j<=n-i+1;j++)            //   for(int j=1;j<=i;j--)
			{                                    //   {
				System.out.print(j+" ");         //     System.out.print(j+" "); 
			}                                    //    }
			System.out.println();                //     System.out.println(); 
		}                                        //  }
	}                                            

}                                                 
