package arrays;

public class Demo2 
{
	public static void main(String[] args) 
	{
		int b[]= {10,20,30,40,50};
		int y[]=array(b);
		System.out.println(y[4]+" ");
		
	}
	static int [] array(int x[])
	{
		x[4]=60;
	  return  x;	
	}

}
