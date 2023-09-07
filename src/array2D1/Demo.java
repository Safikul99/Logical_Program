package array2D1;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:");
		int row=sc.nextInt();
		System.out.println("Enter the col:");
		int col=sc.nextInt();
		int [][]mat=new int[row][col];
		System.out.println("Enter "+row*col+" elements rowwise");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}


	}

}
