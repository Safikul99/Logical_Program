package array2D1;

public class CountOddEven 
{
	public static void main(String[] args) 
	{
		Matrix m=new Matrix();
		System.out.println("Enter first matrix:");
		int[][] mat= m.readMat();
		System.out.println("user Enter Matrix:");
		m.displayMat(mat);

		int []cou=m.countOddEven(mat);//countOddEvenWith
		System.out.println("Even: "+cou[0]);
		System.out.println("Odd: "+cou[1]);
	}

}
