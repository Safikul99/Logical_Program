package array2D;

public class Demo4 
{
	public static void main(String[] args) 
	{
		double total=0;
		for (int i = 0; i < args.length; i++) {
			total=total+Double.parseDouble(args[i]);
			
		}
		System.out.println("Total is: "+total);
		
	}

}
