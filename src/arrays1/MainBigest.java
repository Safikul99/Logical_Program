package arrays1;

public class MainBigest 
{
	public static void main(String[] args) 
	{
		ArrayOperation op=new ArrayOperation();
		int [] x=op.readArray();
		System.out.println("user enterd array: ");
		op.dispArray(x);
		int bg=op.getBigest(x);
		System.out.println("Bigest value is :"+bg);
		
	}

}
