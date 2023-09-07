package array2D1;

public class DiagonalReverseSecondary 
{
	public static void main(String[] args) 
	{
		Matrix m=new Matrix();
		System.out.println("Enter first matrix:");
		int[][] mat= m.readMat();
		System.out.println("user Enter Matrix:");
		m.displayMat(mat);

		m.diaReSecodary(mat);
		System.out.println("After the reverse:");
		m.displayMat(mat);
	}

}
