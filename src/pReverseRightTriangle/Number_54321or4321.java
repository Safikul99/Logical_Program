package pReverseRightTriangle;

import java.util.Scanner;

public class Number_54321or4321 
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
		for(int i=n;i>=1;i--)                   
		{                                        
			for(int j=i;j>=1;j--)            
			{                                    
				System.out.print(j+" ");         
			}                                   
			System.out.println();                
		}                                        
	}                                            



}
