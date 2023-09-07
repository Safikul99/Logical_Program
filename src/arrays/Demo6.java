package arrays;

import java.util.Scanner;

public class Demo6 
{
   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size");
	   int n=sc.nextInt();
	   int []arr=new int[n];
	   System.out.println("Enter"+n+"value");
	   for(int i=0;i<arr.length;i++)
	   {
		   arr[i]=sc.nextInt();
	   }
	   int bg=getBige(arr);
	   System.out.println("Big"+bg);
	   int sm=getSmge(arr);
	   System.out.println("Big"+sm);
	   
	
   }
   public static int getBige(int []x)
   {
	   int big=x[0];
			  for(int i=1;i<x.length;i++)
			  {
				  if(x[i]>big)
				  
					  big=x[i];
				  
			  }
	   return big;
   }
   public static int getSmge(int []x)
   {
	   int sam=x[0];
		  for(int i=1;i<x.length;i++)
		  {
			  if(x[i]<sam)
			  {
				  sam=x[i];
			  }
		  }
      return sam;
	   
   }
   

}
