package array2D1;

public class AddMat 
{
	public static void main(String[] args) 
	{
		Matrix m=new Matrix();
		System.out.println("Read first matrix:");
		int [][] x=m.readMat();
		System.out.println("Read Second matrix:");
		int [][] y=m.readMat();
		System.out.println("user entered first matrix");
		m.displayMat(x);
		System.out.println("user entered second matrix");
		m.displayMat(y);

		int[][] z=m.addMat(x,y);

		if(z==null)
			System.out.println("addition faild");
		else
			System.out.println("added matrix");
		m.displayMat(z);

	}

}
