package array2D1;

public class RowWiseReverse 
{
	public static void main(String[] args) 
	{
		Matrix m=new Matrix();
		System.out.println("Enter first matrix:");
		int[][] mat= m.readMat();
		System.out.println("user Enter Matrix:");
		m.displayMat(mat);

		m.rowwiseRe(mat);
		System.out.println("After the reverse:");
		m.displayMat(mat);
	}

}
