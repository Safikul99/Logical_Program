package arrays;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			System.out.print(a[i]+" ");
		}
	}
	

}
