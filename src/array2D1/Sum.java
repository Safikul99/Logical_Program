package array2D1;

public class Sum 
{
	public static void main(String[] args) 
	{
		Matrix m=new Matrix();
		System.out.println("Read first matrix:");
		int [][] x=m.readMat();
		System.out.println("user entered first matrix");
		m.displayMat(x);
		int res=m.sum(x);
		System.out.println(res);

	}


}
