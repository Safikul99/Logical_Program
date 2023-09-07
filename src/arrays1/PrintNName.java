package arrays1;

import java.util.Scanner;

public class PrintNName 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many names you have:");
		int size=sc.nextInt();
		String []names=new String[size];
		System.out.println("Enter "+size+" names");
		for(int i=0;i<names.length;i++)
		{
			names[i]=sc.next();
		}
		System.out.println("User Entered names: ");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(i+"-> "+names[i]);
		}


	}



}
