package array2D1;

public class SmallestEle 
{
	public static void main(String[] args) 
	{
		Matrix m=new Matrix();
		System.out.println("Enter first matrix:");
		int[][] mat= m.readMat();
		System.out.println("user Enter Matrix:");
		m.displayMat(mat);
		
	 int small=m.getsmallest(mat);
	 System.out.println("Smallest is: "+small);
	}

}
