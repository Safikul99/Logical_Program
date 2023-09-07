package looping;

import java.util.Scanner;

public class PrintTo1ToN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+" ");
		}
//		int i=1;
//		while(i<=n)
//		{
//			System.out.println(i+" ");   //not use while loop bez first linitization 
		                                  //second time condition 
		                                  //thired time inc/dec
		                            //for loop for eazy only one line 
//			i++;
//		}
		
		
	}

}
