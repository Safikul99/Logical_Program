package array2D1;

public class ColWiseReverse 
{
	public static void main(String[] args) 
	{
		Matrix m=new Matrix();
		System.out.println("Enter first matrix:");
		int[][] mat= m.readMat();
		System.out.println("user Enter Matrix:");
		m.displayMat(mat);

		m.colwiseRe(mat);
		System.out.println("After the reverse:");
		m.displayMat(mat);
	}

}
