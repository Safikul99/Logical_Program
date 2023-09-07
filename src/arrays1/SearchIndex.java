package arrays1;

import java.util.Scanner;

public class SearchIndex 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter: "+n+": value");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=getIndex(arr,2);
		System.out.println("Index of Element: "+res);
		
	}
	static int getIndex(int [] x,int n)
	{
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==n)
			return i;	
		}
		return -1;
	}

}
