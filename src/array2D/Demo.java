package array2D;

import java.util.Scanner;

public class Demo {


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enrer row: ");
		int row=sc.nextInt();
		System.out.println("Entre col: ");
		int col=sc.nextInt();
		int [][]n=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				n[i][j]=sc.nextInt();
			}
		}
		System.out.println("array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}



	}
}
