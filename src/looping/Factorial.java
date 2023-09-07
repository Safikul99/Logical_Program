package looping;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
	    int n=sc.nextInt();
	    int fact=1;
	    for(int i=1;i<=n;i++)
	    
	    	fact=fact*i;
	    	System.out.println("Factrol of "+n+" is :"+fact);
	    
		
	}

}
