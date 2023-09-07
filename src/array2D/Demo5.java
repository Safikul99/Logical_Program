package array2D;

public class Demo5 
{
	public static void main(String... args) 
	{
		int res=add(30,add(20,30));
		int res1=add(add(20,30),add(40,50));
		System.out.println(res);
		System.out.println(res1);
		
	}
	static int add(int a,int b)
	{
		return a+b;
	}

}
