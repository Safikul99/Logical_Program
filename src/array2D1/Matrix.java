package array2D1;

import java.util.Scanner;

public class Matrix
{
	int [][]readMat()
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
		return mat;
	}

	void displayMat(int [][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}
	//define a method to return biggest element of matrix
	int getbigest(int [][] mat)
	{
		int big=mat[0][0];
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				if(mat[i][j]>big)
					big=mat[i][j];

			}

		}
		return big;
	}
	//define a method to return add of two  matrix
	int [][] addMat(int[][]a,int [][]b)
	{
		if(a.length!=b.length || a[0].length!=b[0].length)
			return null;
		int [][]c=new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[i].length; j++) 
			{
				c[i][j]=a[i][j]+b[i][j];

			}

		}
		return c;
	}
	//define a method to return smallest element of matrix
	int getsmallest(int [][] mat)
	{
		int sam=mat[0][0];
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				if(mat[i][j]<sam)
					sam=mat[i][j];

			}

		}
		return sam;
	}

	//define a method to return  Sum of all elements in Matrix 

	int sum(int [][]mat)
	{
		int sum=0;
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[0].length; j++) 
			{
				sum=sum+mat[i][i];
			}

		}
		return sum;
	}
	//define a method to how many odd numbers and even numbers present in matrix

	int [] countOddEven(int[][]mat)
	{
		int ev=0,od=0;
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				if(mat[i][j]%2==0)
					ev++;
				else
					od++;

			}

		}
		int []count= {ev,od};
		return count;
	}

	//define a method to how many odd numbers and even numbers present in matrix without if condition

	int [] countOddEvenWith(int[][]mat)
	{
		int[] count= {0,0};
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				count[mat[i][j]%2]++;
			}
		}

		return count;
	}



	//define a method to how many prime number present in the matrix
	//	int countPrime(int []mat)
	//	{
	//		//int count
	//	}

	// row wise biggest elements
	int [] rowwiseBig(int [][] mat)
	{
		int []bg=new int[mat.length];
		for (int i = 0; i < mat.length; i++) 
		{
			int big=mat[i][0];
			for (int j = 1; j <mat[i].length; j++) 
			{
				if(mat[i][j]>big)
					big=mat[i][j];
			}
			bg[i]=big;

		}
		return bg;
	}

	// col wise biggest elements

	int [] colwiseBig(int [][] mat)
	{
		int []bg=new int[mat[0].length];
		for (int i = 0; i < mat[0].length; i++) 
		{
			int big=mat[0][i];
			for (int j = 1; j <mat.length; j++) 
			{
				if(mat[j][i]>big)
					big=mat[j][i];
			}
			bg[i]=big;

		}
		return bg;
	}
	/// row wise sum
	int [] rowwisesum(int [][] mat)
	{
		int[] sum=new int[mat.length];
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j <mat[i].length; j++) 
			{
				sum[i]=sum[i]+mat[i][j];
			}

		}
		return sum;

	}
	/// col wise sum
	int [] colwisesum(int [][] mat)
	{
		int[] sum=new int[mat[0].length];
		for (int i = 0; i < mat[0].length; i++) 
		{
			for (int j = 0; j <mat.length; j++) 
			{
				sum[i]=sum[i]+mat[j][i];
			}

		}
		return sum;

	}
	/// row wise reverse
	void rowwiseRe(int [][]mat)
	{
		for (int i = 0; i < mat.length; i++) 
		{
			int f=0,l=mat[0].length-1;
			while(f<l)
			{
				int temp=mat[i][f];
				mat[i][f]=mat[i][l];
				mat[i][l]=temp;
				f++;
				l--;
			}

		}
	}

	// col wise reverse
	void colwiseRe(int [][]mat)
	{
		for (int i = 0; i < mat[0].length; i++) 
		{
			int f=0,l=mat.length-1;
			while(f<l)
			{
				int temp=mat[f][i];
				mat[f][i]=mat[l][i];
				mat[l][i]=temp;
				f++;
				l--;
			}

		}
	}

	// row wise Smallest elements
	int [] rowwiseSmallest(int [][] mat)
	{
		int []samll=new int[mat.length];
		for (int i = 0; i < mat.length; i++) 
		{
			int sm=mat[i][0];
			for (int j = 1; j <mat[i].length; j++) 
			{
				if(mat[i][j]<sm)
					sm=mat[i][j];
			}
			samll[i]=sm;

		}
		return samll;
	}		
	// col wise Smallest elements

	int [] colwiseSmallest(int [][] mat)
	{
		int []small=new int[mat[0].length];
		for (int i = 0; i < mat[0].length; i++) 
		{
			int sm=mat[0][i];
			for (int j = 1; j <mat.length; j++) 
			{
				if(mat[j][i]<sm)
					sm=mat[j][i];
			}
			small[i]=sm;

		}
		return small;
	}
	/// row wise product
	int [] rowwiseprod(int [][] mat)
	{
		int[] prod=new int[mat.length];
		for (int i = 0; i < mat.length; i++) 
		{
			int p=1;
			for (int j = 0; j <mat[i].length; j++) 
			{
				p=p*mat[i][j];
			}
			prod[i]=p;

		}
		return prod;

	}

	//col wise product
	int [] colwiseprod(int [][] mat)
	{
		int[] prod=new int[mat[0].length];
		for (int i = 0; i < mat[0].length; i++) 
		{
			int p=1;
			for (int j = 0; j <mat[i].length; j++) 
			{
				p=p*mat[j][i];
			}
			prod[i]=p;

		}
		return prod;

	}

	//diagonal reverse both
	void diaRe(int [][]mat)
	{
		int f=0,l=mat.length-1;
		while(f<l)
		{
			int temp=mat[l][l]; //int temp=mat[f][f];
			mat[l][l]=mat[f][f];//	mat[f]f]=mat[l][l];
			mat[f][f]=temp;      //mat[l][l]=temp;

			temp=mat[f][l];  
			mat[f][l]=mat[l][f];  
			mat[l][f]=temp; 
			f++;
			l--;
		}
	}


	//diagonal reverse primary

	void diaRePrimery(int [][]mat)
	{
		int f=0,l=mat.length-1;
		while(f<l)
		{
			int temp=mat[l][l]; //int temp=mat[f][f];
			mat[l][l]=mat[f][f];//	mat[f]f]=mat[l][l];
			mat[f][f]=temp;      //mat[l][l]=temp;
			f++;
			l--;
		}
	}
	//diagonal reverse secondary
	void diaReSecodary(int [][]mat)
	{
		int f=0,l=mat.length-1;
		while(f<l)
		{
			int temp=mat[f][l];  
			mat[f][l]=mat[l][f];  
			mat[l][f]=temp;      
			f++;
			l--;
		}
	}
	//diagonal Biggest elements
	//		int [] DiagonalBig(int[][] mat)
	//		{
	//			int pbig=mat[0][0],sbig[0][mat.length-1];
	//		}
	//define a method to transpose the square matrix

	void transposeSquare(int[][] mat)
	{
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat.length; j++) 
			{
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;

			}

		}	
	}
	//define a method to transpose the Not square matrix
	int[][] transposeNotSquare(int[][] mat)
	{
		int[] []tm=new int[mat[0].length][mat.length];
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat.length; j++) 
			{
				tm[j][i]=mat[i][j];
			}

		}	
		return tm;
	}
	//wajp to rotate the matrix elements into 90 deg left
	//	int[][] rotate90Left(int [][]mat)
	//	{
	//		mat=tra(mat)
	//colwiserever(mat)
	//return mat

	//	}




	//wajp to retuen the differn sum primanr ele and second element 


	int diaSumOfPrimaryandSecon(int [][]mat)
	{
		int f=0,l=mat.length-1;
		int psum=0,ssum=0;
		while(f<l)
		{                         //for(int i=0;i<mat.length;i++)
			psum=psum+mat[l][l]; //  psum=mat[i][i]+psum
			ssum=ssum+mat[f][l];   //ssum=mat[mat.length-1-i]+ssum
			f++;
			l--;
		}
		if(psum>ssum)
			return psum-ssum;
		else
			return ssum-psum;

	}

	//SPiral clock Wise
	void printColckWiseSpiral(int[][] x)
	{
		int n=x.length;
		for (int i = 0,j=n-1; i <j; i++,j--) 
		{
			for(int k=i;k<j;k++)
				System.out.println(x[i][k]+" ");
			for(int k=i;k<j;k++)
				System.out.println(x[k][j]+" ");
			for(int k=j;k>i;k--)
				System.out.println(x[j][k]+" ");
			for(int k=j;k>i;k--)
				System.out.println(x[k][i]+" ");
		}
		if(n%2==1)
			System.out.println(x[n/2][n/2]);

	}
 
	//SPiral Anti clock wise
		void printAntiColckWiseSpiral(int[][] x)
		{
			int n=x.length;
			for (int i = 0,j=n-1; i <j; i++,j--) 
			{
				for(int k=i;k<j;k++)
					System.out.println(x[k][i]+" ");
				for(int k=i;k<j;k++)
					System.out.println(x[j][k]+" ");
				for(int k=j;k>i;k--)
					System.out.println(x[k][j]+" ");
				for(int k=j;k>i;k--)
					System.out.println(x[i][k]+" ");
			}
			if(n%2==1)
				System.out.println(x[n/2][n/2]);

		}


//product two matrix
		int [][] multiTwoMat(int [][]x,int[][]y)
		{
			if(x[0].length!=y.length)
			{
				System.out.println("Not possible..!!");
				return null;
			}
			int [][] z=new int[x.length][y[0].length];
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<y[0].length;j++) {
					for(int k=0;k<y.length;k++)
					{
						z[i][j]=z[i][j]+x[i][k]*y[k][j];
					}
				}
			}
			return z;
		}











}
