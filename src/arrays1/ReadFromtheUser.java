package arrays1;

import java.util.Scanner;

public class ReadFromtheUser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int []ar=new int[size];
		System.out.println("Enter "+size+" values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("User Entered array: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(i+"-> "+ar[i]);
		}
		
		
	}

}
