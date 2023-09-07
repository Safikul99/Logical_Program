package array2D1;

public class BigestEle 
{
	public static void main(String[] args) 
	{
		Matrix m=new Matrix();
		System.out.println("Enter first matrix:");
		int[][] mat= m.readMat();
		System.out.println("user Enter Matrix:");
		m.displayMat(mat);
		
	 int big=m.getbigest(mat);
	 System.out.println("Bigest is: "+big);
	}

}
