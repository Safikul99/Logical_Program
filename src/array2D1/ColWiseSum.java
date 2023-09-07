package array2D1;

public class ColWiseSum 
{
	public static void main(String[] args) 
	{
		Matrix m=new Matrix();
		System.out.println("Enter first matrix:");
		int[][] mat= m.readMat();
		System.out.println("user Enter Matrix:");
		m.displayMat(mat);

		int []b=m.colwisesum(mat);
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(i+1+ " colBigest is: "+b[i]);

		}
	}

}
