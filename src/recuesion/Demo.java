package recuesion;

public class Demo 
{
	static int dis(int n)
	{
		if(n==0||n==1)
			return 1;
		return n*dis(n-1);


	}
	public static void main(String[] args) 

	{
		int res=dis(5);
		System.out.println(res);

	}

}
