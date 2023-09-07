package array2D1;

public class MultiTwoMat 
{
	public static void main(String[] args) 
	{
		Matrix m=new Matrix();
		System.out.println("Enter first matrix:");
		int[][] mat= m.readMat();
		System.out.println("user Enter Matrix:");
		m.displayMat(mat);
		System.out.println("Enter second Matrix");
		int[][] mat1= m.readMat();
		System.out.println("user Enter Matrix:");
		m.displayMat(mat);

		int [][]b=m.multiTwoMat(mat,mat1);
		for (int i = 0; i < b.length; i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}


