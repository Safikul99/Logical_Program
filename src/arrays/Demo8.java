package arrays;

import java.util.Scanner;

public class Demo8 
{
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the size");
		   int n=sc.nextInt();
		   int []arr=new int[n];
		   System.out.println("Enter: "+n+": value");
		   for(int i=0;i<arr.length;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   
		   System.out.println("User Enter array");
		   for(int i=0;i<arr.length;i++)
		   {
			   System.out.print(arr[i]+" ");
		   }
		   
		   System.out.println();
		   reverse(arr);
		   System.out.println("After reverse");
		   for (int i = 0; i < arr.length; i++) 
		   {
			 System.out.print(arr[i]+" ");  
			
	       }
		
	}
	static void  reverse(int []x)
	{
		int i=0,j=x.length-1;
		while(i<j)
		{
			int t=x[i];
			x[i]=x[j];
			x[j]=t;
			i++;
			j--;
		}
	}

}
