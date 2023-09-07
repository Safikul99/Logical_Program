package arrays1;

import java.util.Scanner;

public class ArrayOperation 
{
	int [] readArray()
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
		return ar;
		
	}
	void dispArray(int [] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}
		System.out.println();
		
	}
	
	public int getBigest(int[] ar) {
		
		int big=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>big)
			big=ar[i];	
		}
		return big;
	}
	

}
