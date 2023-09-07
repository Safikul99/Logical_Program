package recuesion;

public class pow 
{
	public static void main(String[] args) 
	{
		int res=pow(5,3);
		System.out.println(res);


	}
	static int pow(int n,int p)
	{
		if(p==0)
			return 1;
		return n*pow(n,p-1);
	}

}
